package prova1b;

public interface SuperParticipante {
	
	Grupo criarGrupo(String nome);
	
	void adicionarParticipante(Participante participando, Grupo grupo);
	
	boolean removerParticipante(Participante participante, Grupo grupo);

}
