package prova1b;

import java.util.ArrayList;

public abstract class Participante {
	protected ArrayList<Mensagem> mensagens;
	protected String nome;
	
	public String getNome() {
		return nome; 
	}
	
	public abstract ArrayList<Mensagem> getMensagens();
	
	abstract void enviaMensagem(String texto, Grupo g);
	
	public String toString() {
		return nome;
	}
}
