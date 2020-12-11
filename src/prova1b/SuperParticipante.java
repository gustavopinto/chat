package prova1b;

public interface SuperParticipante {
	
	Grupo criarGrupo(String nome) throws StringVazia;
	
	void adicionarParticipante(Participante p);
	
	boolean removerParticipante(Participante p);

}
