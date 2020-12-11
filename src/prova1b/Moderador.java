package prova1b;

public class Moderador extends Participante implements SuperParticipante{

	Grupo grupo;

	public Moderador(String nome) {
		super(nome);		
	}
	
	public Grupo criarGrupo (String nome){	
		Grupo g = new Grupo(nome);
		g.additionarParticipante(this);
		this.grupo = g;
		return g;
	}

	@Override
	public void addicionarParticipante(Participante p) {
		this.grupo.additionarParticipante(p);
	}

	@Override
	public boolean removerParticipante(Participante p) {
		return this.grupo.removerParticipante(p);	
	}

	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem m = new Mensagem(texto);
		g.enviarMensagem(m);		
	}
	
	public Grupo getGrupo() {
		return grupo;
	}
	

}
