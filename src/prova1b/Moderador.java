package prova1b;

import static java.util.Arrays.copyOf;

public class Moderador extends Participante implements SuperParticipante {
	private String nome;

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.adicionarParticipantes(this);
		this.grupo = g;
		return g;
	}
}
