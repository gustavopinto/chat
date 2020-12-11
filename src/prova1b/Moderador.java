package prova1b;

import static java.util.Arrays.copyOf;

public class Moderador extends Participante implements SuperParticipante {
	private String nome;
	private Grupo grupo;

	public Moderador(String nome) {
		this.nome = nome;
	}

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.adicionarParticipantes(this);
		this.grupo = g;
		return g;
	}

	@Override
	public void adicionarParticipante(Participante p) {
		Participante[] ps = copyOf(grupo.getParticipantes(), grupo.getParticipantes().length + 1);
		ps[grupo.getParticipantes().length] = p;
		this.grupo.participantes = ps;
	}

	@Override
	public boolean removerParticipante(Participante p) {
		for (int i = 0; i < grupo.getParticipantes().length; i++) {
			if(grupo.getParticipantes()[i].equals(p)) {
				Participante[] ps = new Participante[grupo.getParticipantes().length -1];
				int remainingElements = grupo.getParticipantes().length - (i + 1);
				System.arraycopy(grupo.getParticipantes(), 0, ps, 0, i);
				System.arraycopy(grupo.getParticipantes(), i+ 1, ps, i, remainingElements);

				this.grupo.participantes = ps;
				return true;
			}
		}
		return false;
	}

	@Override
	void enviarMensagem(String texto, Grupo g) {

	}
}
