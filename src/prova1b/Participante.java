package prova1b;

public abstract class Participante {

	private String nome;
	
	public Participante(String nome) throws StringVazia{
		
		if(nome == "") {
			throw new StringVazia("O nome do participante não pode ser vazio");
		}
		
		this.nome = nome;
	}
	
	abstract void enviaMensagem(String texto, Grupo g);
	
	public String getNome() {
		return nome;
	}
}
