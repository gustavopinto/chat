import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Mensagem {

	private Participante remetente;
	private String texto;
	private LocalDateTime dataHora;

	public Mensagem(String texto, Participante participante) {
		this.texto = texto;
		this.dataHora = LocalDateTime.now();
		this.remetente = participante;
	}

	public String getDataHora() {
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("HH:mm");
		return this.dataHora.format(formatador);
	}
	
	public String getMensagem() {
		return texto;
	}

	@Override
	public String toString() {
		return remetente +
			": " + texto +
			" (" + getDataHora() + ")";
	}
}
