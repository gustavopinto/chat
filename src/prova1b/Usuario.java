package prova1b;

public class Usuario extends Participante {
	private String nome;
	
	public Usuario (String nome) {
		this.nome = nome;
	}

	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem msg = new Mensagem(texto, this);
		g.envarMensagem(msg);
	}
}
