package prova1b;

import java.util.ArrayList;

public class Moderador extends Participante implements SuperParticipante{
	private Grupo grupo;
	
	public Moderador(String nome) {
		this.nome = nome;
	}
	
	public Grupo criarGrupo(String nome){
		Grupo g = new Grupo(nome, this);		
		this.grupo = g;
		return grupo;
	} 
	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem msg = new Mensagem(texto);
		g.enviarMensagem(msg);		
	}

	@Override
	public void addicionarParticipante(Participante p) {
		this.grupo.adicionarParticipante(p);		
	}

	@Override
	public boolean removerParticipante(Participante p) {
		boolean resp = false;
		
		if(this.grupo.removerParticipante(p)) {
			resp = true;
		}		
		return resp;
	}

	@Override
	public ArrayList<Mensagem> getMensagens() {
		return mensagens;
	}
}
