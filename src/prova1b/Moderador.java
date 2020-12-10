package prova1b;

public class Moderador {

	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome);
		g.adicionarParticipante(this);
		this.grupo = g;
		return g;
	}
}
