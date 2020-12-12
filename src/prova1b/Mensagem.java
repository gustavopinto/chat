package prova1b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Mensagem {
	private Participante remetente;
	private String texto;
	private String horaEnviada; 
	
	private String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date(); 
		return dateFormat.format(date); 
	}
		
	
	public Mensagem (Participante remetente, String texto){
		this.remetente = remetente;
		this.texto = texto;
		this.horaEnviada = getDateTime();
	}

	public String getRemetente() {
		return remetente.getNome();
	}

	public String getTexto() {
		return texto;
	}

	public String getHoraEnviada() {
		return horaEnviada;
	}

}
