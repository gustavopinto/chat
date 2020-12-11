package prova1b;
import java.util.List;
import java.util.ArrayList;

public class Grupo {

	private String nome;
	private List<Mensagem>mensagens;
	private List<Participante>participantes;
	
	
	public Grupo(String nome) {
		this.nome = nome;
		this.mensagens = new ArrayList<>();
		this.participantes = new ArrayList<>();
	}
	
	public void adicionarParticipante(Participante p) {
		this.participantes.add(p);
	}
	
	public boolean removerParticipante(Participante p) {
		Boolean flag = this.participantes.remove(p);
		if (flag)
			return true;
		return false;
	}
	
	public void enviarMensagem(Mensagem m) {
		this.mensagens.add(m);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public List<Mensagem> getMensagens() {
		return this.mensagens;
	}
	
	public List<Mensagem> getParticipantes(){
		return this.mensagens;
	}
}
