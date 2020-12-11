package prova1b;

import java.util.ArrayList;

public class Moderador extends Participante implements SuperParticipante{
	private Grupo grupo;
	
	public Moderador(String nome) {
		this.nome = nome;
	}
	
	public Grupo criarGrupo(String nome){
		Grupo g = null;
		try {
			g = new Grupo(nome, this);
		} catch (ObjetoNulo e) {
			e.printStackTrace();
		}				
		this.grupo = g;
		return grupo;
	} 
	@Override
	void enviaMensagem(String texto, Grupo g) {
		Mensagem msg = new Mensagem(texto);
		g.enviarMensagem(msg);		
	}

	@Override
	public void addicionarParticipante(Participante p) throws ObjetoNulo {
		if(p != null) {
			try {
				this.grupo.adicionarParticipante(p);
			} catch(ObjetoNulo e) {
				e.printStackTrace();				
			}			
		} else {			
			throw new ObjetoNulo("'p' esta nulo");
		}
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
