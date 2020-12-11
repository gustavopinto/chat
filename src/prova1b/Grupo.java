package prova1b;

import static java.util.Arrays.copyOf;

public class Grupo {

	private String nome;
	private Mensagem[] mensagens;
	private Participante[] participantes;

	public Grupo(String nome) {
		this.nome = nome;
	}

	public void adicionarParticipantes(Participante p) {
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
	
	public void enviarMensagem(Mensagem m) {
		Mensagem[] msg = copyOf(mensagens, mensagens.length + 1);
		msg[mensagens.length] = m;
		this.mensagens = msg;
	}

	public String getNome() {
		return nome;
	}


	public Participante[] getParticipantes() {
		return participantes;
	}
}
