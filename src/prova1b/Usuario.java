package prova1b;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Usuario extends Participante {
	
	public Usuario(String nome) {
		super(nome);
		
	}

	@Override
	public void enviaMensagem(String texto, Grupo g) {
		
		final String dataHora = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Mensagem msg = new Mensagem(texto, dataHora);
		
		g.enviarMensagem(msg);
		
	}

}
