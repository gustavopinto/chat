package prova1b;

public abstract class Participante {

	private String nome;

	public Participante(String nome){
		this.nome = nome;
	}
	
	abstract void enviarMensagem(String texto, Grupo g);

	public String toString() {
		return nome;
	}

	public String getNome() {
		return nome;
	}
}
