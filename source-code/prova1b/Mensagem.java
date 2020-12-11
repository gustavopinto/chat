package prova1b;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Mensagem {

	private String texto, horario, data; 
	
	public Mensagem(String msg) {
		this.texto = msg;
		
		Date date = new Date();
        String dataAtual = DateFormat.getDateInstance(DateFormat.MEDIUM).format(date);
		this.data = dataAtual;
		
		Calendar cal = Calendar.getInstance();
		this.horario = cal.get(Calendar.HOUR_OF_DAY) + ":" + cal.get(Calendar.MINUTE) ;
	}
	public String getFullMensagem() {
		return data + " [" + horario + "] ~ " + texto; 
	}
	public String getShortMensagem() {
		return texto; 
	}
	public String getHora() {		
		return horario;
	}
	public String getData() {		
		return data;
	}
}
