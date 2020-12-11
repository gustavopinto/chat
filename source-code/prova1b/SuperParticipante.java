package prova1b;

public interface SuperParticipante {
	
	Grupo criarGrupo(String nome);
	
	void addicionarParticipante(Participante p) throws ObjetoNulo;
	
	boolean removerParticipante(Participante p);

}
