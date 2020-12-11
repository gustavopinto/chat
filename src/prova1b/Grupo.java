package prova1b;

import java.util.LinkedList;
import java.util.List;
public class Grupo {

	private String nome;
    private List<Mensagem> mensagens = new LinkedList<>();
    private List<Participante> participantes = new LinkedList<>();
    
    
    public Grupo(String nome) {
    	
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
    
    public void additionarParticipante(Participante p) {
        this.participantes.add(p);
    }
    
    

    public boolean removerParticipante(Participante p) {
        for (int i = 0; i < participantes.size(); i++) {
            if(this.participantes.get(i).equals(p)) {            	
                this.participantes.remove(i);
                return true;
            }           
        }
        return false;
    }
   

    public void enviarMensagem(Mensagem m) {
        this.mensagens.add(m);
    }

    public String getNome() {
        return this.nome;
    }

    public List<Participante> getParticipantes() {
        return this.participantes;
    }

    public List<Mensagem> getMensagens() {
        return this.mensagens;
    }
}
