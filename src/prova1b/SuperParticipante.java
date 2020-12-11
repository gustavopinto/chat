package prova1b;

public interface SuperParticipante {
	
	Grupo criarGrupo(String nome);
	
	void adicionarParticipante(Participante p);
	
	boolean removerParticipante(Participante p);

}
