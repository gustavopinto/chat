package prova1b;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Moderador extends Participante implements SuperParticipante{
	
	public Moderador(String nome) {
		super(nome);
		
	}

	private Grupo grupo;
	
	@Override
	public void enviaMensagem(String texto, Grupo g) {
		
		final String dataHora = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Mensagem msg = new Mensagem(texto, dataHora);
		
		g.enviarMensagem(msg);
		
	}

	public Grupo criarGrupo(String nome){  //exceção nome nulo
		Grupo g = new Grupo(nome);
		g.addicionarParticipante(this);
		this.grupo = g;
		return g;
	}
	
	public void addicionarParticipante(Participante p) {
		
		this.grupo.addicionarParticipante(p);
		
	}
	
	public boolean removerParticipante(Participante p) {
		boolean participanteExiste = this.grupo.removerParticipante(p);
		return participanteExiste;
	}
	
	
}
