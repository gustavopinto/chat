package prova1b;

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
	
	public void adicionarAoGrupo(Participante participante) {
		this.participantes.add(participante);
	}
	
	public boolean removerDoGrupo(Participante participante) {
		Boolean flag = this.participantes.remove(participante);
		
		if (flag) return true;
	
		return false;
	}
	
	public void receberMensagemParticipante(Mensagem mensagem) {
		this.mensagens.add(mensagem);
	}

	public String getNome() {
		return nome;
	}

	public List<Mensagem> getMensagens() {
		return mensagens;
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}
}
