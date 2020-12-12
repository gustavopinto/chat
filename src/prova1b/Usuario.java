package prova1b;

public class Usuario extends Participante {

	public Usuario(String nome) {
		super(nome);
	}
	
	public String getNome() {
		return super.getNome();
	}

	@Override
	void enviarMensagem(String texto, Grupo grupo) {
		Mensagem mensagem = new Mensagem(this, texto);
		grupo.receberMensagemParticipante(mensagem);
		
	}
}
