package prova1b;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.copyOf;

public class Grupo {

	private String nome;
	private Mensagem[] mensagens;
	private List<Participante> participantes = new ArrayList<>();


	public Grupo(String nome) {
		this.nome = nome;
	}

	public void adicionarParticipantes(Participante p) {
		participantes.add(p);
	}
	
	public boolean removerParticipante(Participante p) {
		return this.participantes.remove(p);
	}
	
	public void enviarMensagem(Mensagem m) {
		Mensagem[] msg = copyOf(mensagens, mensagens.length + 1);
		msg[mensagens.length] = m;
		this.mensagens = msg;
	}

	public String getNome() {
		return nome;
	}


	public List<Participante> getParticipantes() {
		return participantes;
	}

	public Mensagem[] getMensagens() {
		return mensagens;
	}
}
