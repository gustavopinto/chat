package prova1b;

public class Moderador extends Participante implements SuperParticipante {
	
	public Moderador(String nome) {
		super(nome);
	}
	
	public Grupo criarGrupo(String nome){
		Grupo grupo = new Grupo(nome);
		grupo.adicionarAoGrupo(this);
		
		return grupo;
	}

	@Override
	void enviarMensagem(String texto, Grupo grupo) {
		Mensagem mensagem = new Mensagem(this, texto);
		grupo.receberMensagemParticipante(mensagem);
	}

	@Override
	public void adicionarParticipante(Participante participante, Grupo grupo) {
		grupo.adicionarAoGrupo(participante);
	}

	@Override
	public boolean removerParticipante(Participante participante, Grupo grupo) {
		boolean response;
		try {
			response = grupo.removerDoGrupo(participante);
			
		} catch (Exception error) {
			response = false;
			System.out.println("Não foi possível remover participante " + participante.getNome() + " do grupo");
			System.out.println("Erro ocorrido: " + error);
		}
		
		return response;
	}

}
