package prova1b;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Usuario extends Participante {
	
	public Usuario(String nome) throws StringVazia {
		super(nome);
		
	}

	@Override
	public void enviaMensagem(String texto, Grupo g) {
		
		final String dataHora = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Mensagem msg = new Mensagem(texto, dataHora);
		
		try {
			g.enviarMensagem(msg, "Usuario");
		} catch (StringVazia e) {
			System.out.println("Insira a mensagem que você deseja enviar");
			
			Scanner input = new Scanner(System.in);
			texto = input.next();
			
			final String dataHoraNova = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
			
			Mensagem mensagem = new Mensagem(texto, dataHoraNova);
			
			try {
				g.enviarMensagem(mensagem, "Usuario");
			} catch (StringVazia e1) {
				e1.printStackTrace();
			}
		}
		
	}

}
