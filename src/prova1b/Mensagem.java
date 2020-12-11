package prova1b;

public class Mensagem {

	private Moderador texto;
	private String dataHora;
	
	public String getDataHora() {
		return dataHora;
	}
	
	public Participante getMensagem() {
		return texto;
	}
	
	public Mensagem(Participante texto, String dataHora) {
		this.texto = (Moderador) texto;
		this.dataHora = dataHora;
	}
}
