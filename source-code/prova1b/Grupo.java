package prova1b;



import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Grupo {

	private String nome;
	private ArrayList<Mensagem> mensagens;
	private ArrayList<Participante> participantes;
	private String datamsg;
	
	public Grupo(String nome, Participante adm) {
		this.nome = nome;
		ArrayList<Participante> init = new ArrayList();
		ArrayList<Mensagem> initMsg = new ArrayList();
		this.mensagens = initMsg;
		init.add(adm);
 		this.participantes = init;
	}
	
	String getNome() {
		return nome;
	}
	public void adicionarParticipante(Participante p) {
		this.participantes.add(p);
        
	}
	
	public boolean removerParticipante(Participante p) {
		
		for (int i = 0; i < this.participantes.size(); i++) {
            if(this.participantes.get(i).equals(p)){
                System.out.println("é igual");
                this.participantes.remove(i);
                return true; 
            }        
		}
		return false;
	}
	
	public void enviarMensagem(Mensagem m) {
		this.mensagens.add(m);
	}
	
	public ArrayList<Participante> getParticipantes() {
        return participantes;
	}

	public ArrayList<Mensagem> getMensagens() {
		return mensagens;
	}
	
}
