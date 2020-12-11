package prova1b;

public class Usuario extends Participante {

	public Usuario(String nome) {
		this.nome = nome; 
	}

	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem msg = new Mensagem(texto);
		g.enviarMensagem(msg);		
		
	}

}
