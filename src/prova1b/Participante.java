package prova1b;

public abstract class Participante {

	private String nome;
	
	abstract void enviarMensagem(String texto, Grupo g);
	
	public String toString() {
		return nome;
	}
}
