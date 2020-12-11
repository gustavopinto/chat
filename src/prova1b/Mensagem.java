package prova1b;

public class Mensagem {

	private String texto;
	private String dataHora;
	
	public Mensagem(String texto, String dataHora) {
		this.texto = texto;
		this.dataHora = dataHora;
	}
	
	public String getMensagem() {
		return texto;
	}
	
	public String getDataHora() {
		return dataHora;
	}
}
