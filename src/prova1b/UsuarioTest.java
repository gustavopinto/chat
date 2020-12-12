package prova1b;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	
	public String getDateTime() { 
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); 
		Date date = new Date(); 
		return dateFormat.format(date); 
	}
	
	@Test
	public void enviarMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		
		
		Assert.assertEquals("MENSAGENS DO GRUPO \n" + 
				"Gustavo(Envio: " + getDateTime() + "): Oi pessoal" ,turmaOO2.getMensagens());
	}
	
}
