package prova1b;

public class Moderador extends Participante implements SuperParticipante {
	private Grupo grupo;
	
	public Moderador(String nome) {
		super(nome);
	}

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.adicionarParticipante(this);
		this.grupo = g;
		return g;
	}

	@Override
	public void adicionarParticipante(Participante p, Grupo g) {
		grupo.adicionarParticipante(p);
		
	}

	@Override
	public boolean removerParticipante(Participante p, Grupo g) {
		grupo.removerParticipante(p);
		return false;
	}

	@Override
	void enviarMensagem(String texto, Grupo g) {
		Mensagem m = new Mensagem(this, texto);
		
	}
}
