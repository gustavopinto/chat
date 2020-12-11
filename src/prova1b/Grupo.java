package prova1b;

import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private String nome;
	
	private List<Mensagem> mensagens;
	private List<Participante> participantes;
	
	public Grupo(String nome) throws StringVazia{
		
		if(nome == "") {
			throw new StringVazia("O nome do grupo não pode ser vazio");
		}
		
		this.nome = nome;
		this.mensagens = new ArrayList<>();
		this.participantes = new ArrayList<>();
	}
	
	public void adicionarParticipante(Participante p) throws ParticipanteRepetido{
		if(this.participantes.indexOf(p) != -1) {
			throw new ParticipanteRepetido("O participante já está no grupo");
		}
		
		this.participantes.add(p);
	}
	
	public boolean removerParticipante(Participante p) throws ParticipanteInexistente{
		
		if(this.participantes.indexOf(p) == -1) {
			throw new ParticipanteInexistente("Não existe esse participante no grupo");
		}
		
		boolean participanteExiste = participantes.remove(p);
		
		return participanteExiste;
	}
	
	public void enviarMensagem(Mensagem m, String tipoParticipante) throws StringVazia{
		
		if(m.getMensagem() == "" && tipoParticipante.equals("Usuario") || 
			m.getMensagem() == "Moderador: " && tipoParticipante.equals("Moderador")) {
			throw new StringVazia("A mensagem não pode ser vazia");
		}
		
		this.mensagens.add(m);
	}
	
	public String getNome() {
		return this.nome;
	}
	public List<Participante> getParticipantes() {
		return this.participantes;
	}
	
	public List<Mensagem> getMensagens() {
		return this.mensagens;
	}
}
