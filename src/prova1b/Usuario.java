package prova1b;

public class Usuario extends Participante {
	public Usuario(String nome) {
		super(nome);
	}
	
	public String getNome() {
		return super.getNome();
	}

	@Override
	void enviarMensagem(String texto, Grupo g) {
		Mensagem m = new Mensagem(this, texto);
		
		
	}
}
