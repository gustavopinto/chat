package prova1b;

public abstract class Participante {

	private String nome;
	
	public Participante(String nome) {
        try {
            if (nome.length() <= 12) {
                this.nome = nome;
            }
            else {
                throw new TamanhoExcedido("Erro: entrada maior que 12 caracteres");
            }
        }
        catch (TamanhoExcedido e) {
            System.out.println("Tamanho da entrada excedido");
            this.nome = null;
        }     
    }
	
	abstract void enviaMensagem(String texto, Grupo g);
	
	public String toString() {
		return nome;
	}	
}
