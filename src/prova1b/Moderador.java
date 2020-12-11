package prova1b;

public class Moderador extends Participante implements SuperParticipante {
	private String nome;
	private Grupo grupo;

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.adicionarParticipantes(this);
		this.grupo = g;
		return g;
	}

	@Override
	public void adicionarParticipante(Participante p) {

	}

	@Override
	public boolean removerParticipante(Participante p) {
		return false;
	}

	@Override
	void enviarMensagem(String texto, Grupo g) {

	}
}
