package prova1b;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private String nome;
	private List<Mensagem> mensagens = new ArrayList<>();
	// private Mensagem[] mensagens;
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
	
	public void enviarMensagem(Mensagem msg) {
		this.mensagens.add(msg);
	}

	public String getNome() {
		return nome;
	}


	public List<Participante> getParticipantes() {
		return participantes;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}
}
