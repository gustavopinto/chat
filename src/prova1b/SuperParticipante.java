package prova1b;

public interface SuperParticipante {
	
	Grupo criarGrupo(String nome);
	
	void adicionarParticipante(Participante p, Grupo g);
	
	boolean removerParticipante(Participante p, Grupo g);

	

}
