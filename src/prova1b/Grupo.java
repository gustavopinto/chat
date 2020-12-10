package prova1b;

import static java.util.Arrays.copyOf;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private String nome;
	private List<Mensagem> mensagens;
	private List<Participante> participantes;
	
	public Grupo(String nome) {
		this.nome = nome;
		this.mensagens = new ArrayList<Mensagem>();
		this.participantes = new ArrayList<Participante>();
	}
	
	public void adicionarParticipante(Participante participante) {
		this.participantes.add(participante);
	}
	
	public boolean removerParticipante(Participante participante) {
		Boolean flag = this.participantes.remove(participante);
		
		if (flag) return true;
	
		return false;
	}
	
	public void enviarMensagem(Mensagem mensagem) {
		this.mensagens.add(mensagem);
	}
}
