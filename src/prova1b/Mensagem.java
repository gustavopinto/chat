package prova1b;

import java.util.Calendar;
import java.util.Date;

public class Mensagem {

	private String texto;
	private Date data;

	public Mensagem(String texto){
		this.texto = texto;
		this.data = Calendar.getInstance().getTime();
	}

	public String getMensagem() {
		return texto;
	}
}
