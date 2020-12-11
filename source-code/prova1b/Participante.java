package prova1b;

public abstract class Participante {

	protected String nome;
	
	public String getNome() {
		return nome;
	}
	abstract void enviaMensagem(String texto, Grupo g);
	
	public String toString() {
		return nome;
	}
}
