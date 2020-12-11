package prova1b;

public class Mensagem {

	private String texto;
	private Participante p;
	
	public Mensagem(String texto, Participante p) {
		this.texto = texto;
		this.p = p;
	}
	
	public String getMensagem() {
		return texto;
	}
}
