public class Moderador extends Participante implements SuperParticipante {
	private Grupo grupo;

	public Moderador(String nome) {
		super(nome);
	}

	public Grupo getGrupo() {
		return this.grupo;
	}

	public Grupo criarGrupo(String nome){
		Grupo grupo = new Grupo(nome);
		grupo.incluirParticipante(this);
		this.grupo = grupo;
		return grupo;
	}

	@Override
	public void adicionarParticipante(Participante participante) {
		this.grupo.incluirParticipante(participante);
	}

	@Override
	public boolean removerParticipante(Participante participante) {
		return this.grupo.excluirParticipante(participante);
	}
}
