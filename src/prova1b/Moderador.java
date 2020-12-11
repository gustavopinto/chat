package prova1b;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Moderador extends Participante implements SuperParticipante{
	
	public Moderador(String nome) throws StringVazia {
		super(nome);		
	}

	private Grupo grupo;
	
	@Override
	public void enviaMensagem(String texto, Grupo g) {
		
		String mensagemModerador = "Moderador: ";
		String mensagemCompleta = mensagemModerador.concat(texto);
		
		final String dataHora = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Mensagem msg = new Mensagem(mensagemCompleta, dataHora);
		
		try {
			g.enviarMensagem(msg, "Moderador");
		} catch (StringVazia e) {
			System.out.println("Insira a mensagem que você deseja enviar");
			
			Scanner input = new Scanner(System.in);
			String textoProvisorio = input.next();
			texto = mensagemModerador.concat(textoProvisorio);
			
			final String dataHoraNova = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
			
			Mensagem mensagem = new Mensagem(texto, dataHoraNova);
			
			try {
				g.enviarMensagem(mensagem, "Moderador");
			} catch (StringVazia e1) {
				e1.printStackTrace();
			}
		}
		
	}

	public Grupo criarGrupo(String nome) throws StringVazia{
		
		if(nome == "") {
			throw new StringVazia("O nome do grupo não pode ser vazio");
		}
		
		Grupo g = new Grupo(nome);
		
		try {
			g.adicionarParticipante(this);
		} catch (ParticipanteRepetido e) {
			e.printStackTrace();
		}
		
		this.grupo = g;
		return g;
	}
	
	public void adicionarParticipante(Participante p) {
		
		try {
			this.grupo.adicionarParticipante(p);
		} catch (ParticipanteRepetido e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean removerParticipante(Participante p) {
		boolean participanteExiste = true;
		
		try {
			this.grupo.removerParticipante(p);
		} catch (ParticipanteInexistente e) {
			participanteExiste = false;
			e.printStackTrace();
			return participanteExiste;
		}
		
		return participanteExiste;
	}

	
	
}
