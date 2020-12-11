package prova1b;

public abstract class Participante {

	private String nome;
	
	public Participante(String nome) {
		this.nome = nome;
	}
	
	abstract void enviaMensagem(String texto, Grupo g);
	
	public String getNome() {
		return nome;
	}
}
