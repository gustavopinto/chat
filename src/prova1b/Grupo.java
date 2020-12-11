package prova1b;

import static java.util.Arrays.copyOf;

import java.util.List;

public class Grupo {

	private String nome;
	private List<Mensagem> mensagens;
	private Participante[] participantes;
	
	public Grupo(String nome) {
		this.nome = nome;
	}
	
	public void additionarParticipante(Participante p) {
		Participante[] ps = copyOf(participantes, participantes.length + 1);
		ps[participantes.length] = p;
		this.participantes = ps;
	}
	
	public boolean removerParticipante(Participante p) {
		for (int i = 0; i < participantes.length; i++) {
			if(participantes[i].equals(p)) {
				Participante[] ps = new Participante[participantes.length -1];
				int remainingElements = participantes.length - (i + 1);
				System.arraycopy(participantes, 0, ps, 0, i);
				System.arraycopy(participantes, i+ 1, ps, i, remainingElements);
				
				this.participantes = ps;
				return true;
			}
		}
		return false;
	}
	
	public void envarMensagem(Mensagem m) {
		this.mensagens.add(m);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public Participante[] getParticipantes() {
		return this.participantes;
	}
	
	public List<Mensagem> getMensagens() {
		return this.mensagens;
	}
}
