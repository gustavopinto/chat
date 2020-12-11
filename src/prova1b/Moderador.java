package prova1b;

public class Moderador extends Participante implements SuperParticipante {
	private String nome;
	private Grupo grupo;

	public Moderador(String nome) {
		this.nome = nome;
	}

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.adicionarParticipantes(this);
		this.grupo = g;
		return g;
	}

	@Override
	public void adicionarParticipante(Participante p) {
		grupo.adicionarParticipantes(p);
	}

	@Override
	public boolean removerParticipante(Participante p) {
		return grupo.removerParticipante(p);
	}

	@Override
	void enviarMensagem(String texto, Grupo g) {
		Mensagem msg = new Mensagem(texto);
		g.enviarMensagem(msg);
	}
}
