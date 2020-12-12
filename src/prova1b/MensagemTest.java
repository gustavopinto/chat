package prova1b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MensagemTest {
	Participante fulano = new Usuario("Fulano");
	
	@Test
	void testMensagem() {
		Mensagem mensagem = new Mensagem(fulano, "Enviando mensagem de teste ao grupo");
		
		Assert.assertNotNull(mensagem);
	}

	@Test
	void testGetRemetente() {
		Mensagem mensagem = new Mensagem(fulano, "Enviando mensagem de teste ao grupo");
		
		Assert.assertEquals("Fulano", mensagem.getRemetente());
	}

}
