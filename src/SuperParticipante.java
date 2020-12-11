public interface SuperParticipante {
	
	Grupo criarGrupo(String nome);

	void adicionarParticipante(Participante participante);

	boolean removerParticipante(Participante participante);
}
