import java.util.Objects;

public abstract class Participante {

	private String nome;

	public Participante(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return this.nome;
	}

	public void enviaMensagem(String texto, Grupo grupo) {
		Mensagem mensagem = new Mensagem(texto, this);
		grupo.enviarMensagem(mensagem);
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Participante that = (Participante) o;
		return nome.equals(that.nome);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}
}
