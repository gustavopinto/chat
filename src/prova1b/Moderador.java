package prova1b;

public class Moderador extends Participante implements SuperParticipante {
	String nome;
	Grupo grupo;
	
	public Moderador(String nome) {
		this.nome = nome;
	}

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.additionarParticipante(this);
		this.grupo = g;
		return g;
	}

	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem msg = new Mensagem(texto, this);
		grupo.envarMensagem(msg);
	}

	@Override
	public void addicionarParticipante(Participante p) {
		grupo.additionarParticipante(p);
	}

	@Override
	public boolean removerParticipante(Participante p) {
		return grupo.removerParticipante(p);
	}
}
