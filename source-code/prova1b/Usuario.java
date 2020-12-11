package prova1b;

import java.util.ArrayList;

public class Usuario extends Participante {

	public Usuario(String nome) {
		this.nome = nome;
		ArrayList<Mensagem> msg = new ArrayList();
		this.mensagens = msg;
	}

	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem msg = new Mensagem(texto);
		this.mensagens.add(msg);
		g.enviarMensagem(msg);		
		
	}

	@Override
	public ArrayList<Mensagem> getMensagens() {		
		return this.mensagens;
	}

}
