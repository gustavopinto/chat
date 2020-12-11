import java.util.ArrayList;
import java.util.List;

public class Grupo {

	private String nome;
	private List<Mensagem> mensagens;
	private List<Participante> participantes;

	public Grupo(String nome) {
		this.nome = nome;
		this.participantes = new ArrayList<>();
		this.mensagens = new ArrayList<>();
	}

	public String getNome() {
		return this.nome;
	}

	public Mensagem[] getMensagens() {
		// As mensagens são retornadas em forma de ARRAY para não prejudicar os testes unitários já existentes (JUnit).
		Mensagem[] mensagens = new Mensagem[this.mensagens.size()];
		return this.mensagens.toArray(mensagens);
	}

	public Participante[] getParticipantes() {
		// As mensagens são retornadas em forma de ARRAY para não prejudicar os testes unitários já existentes (JUnit).
		Participante[] participantes = new Participante[this.participantes.size()];
		return this.participantes.toArray(participantes);
	}

	public void incluirParticipante(Participante participante) {
		try {
			if (this.participantes.contains(participante)) {
				throw new Exception("O participante já foi adicionado ao grupo!");
			}

			this.participantes.add(participante);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public boolean excluirParticipante(Participante participante) {
		try {
			if (!this.participantes.contains(participante)) {
				throw new Exception("O participante não está no grupo!");
			}

			return this.participantes.remove(participante);
		} catch(Exception e) {
			return false;
		}
	}
	
	public void enviarMensagem(Mensagem mensagem) {
		try {
			this.mensagens.add(mensagem);
		} catch(Exception e) {
			System.out.println("Erro ao enviar a mensagem!");
		}
	}

	@Override
	public String toString() {
		String output = "Grupo: " + this.nome + " (" + this.participantes.size() + " online)";

		for(Participante participante : this.participantes){
			output += "\n\t- " + participante;
		}

		return output;
	}
}
