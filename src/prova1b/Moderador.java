package prova1b;

public class Moderador extends Participante implements SuperParticipante {

	public Grupo criarGrupo(String nome){
		Grupo grupo = new Grupo(nome);
		grupo.adicionarParticipante(this);
		return grupo;
	}

	@Override
	void enviarMensagem(String texto, Grupo g) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void adicionarParticipante(Participante p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean removerParticipante(Participante p) {
		// TODO Auto-generated method stub
		return false;
	}
}
