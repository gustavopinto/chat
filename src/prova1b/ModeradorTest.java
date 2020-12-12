package prova1b;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ModeradorTest {

	Moderador gustavo = new Moderador("Gustavo");
	
	Grupo turmaPC2 = gustavo.criarGrupo("PC2 - NOITE");

	@Test
	void testModerador() {
		Assert.assertNotNull(gustavo);
	}
	
	@Test
	void testCriarGrupo() {
		Assert.assertNotNull(turmaPC2);
	}
	
	@Test
	void testEnviarMensagem() {
		gustavo.enviarMensagem("Teste envio de mensagem", turmaPC2);
		
		String response = turmaPC2.getMensagens();

		Assert.assertNotNull(response);
	}
	
	@Test
	void testAdicionarParticipante() {
		Participante fulano = new Usuario("Fulano");
		
		gustavo.adicionarParticipante(fulano, turmaPC2);
		
		String listaParticipantes = turmaPC2.getParticipantes();
		
		Assert.assertNotNull(listaParticipantes);
	}
	
	@Test
	void testRemoverParticipante() {
		Participante fulano = new Usuario("Fulano");
		
		gustavo.adicionarParticipante(fulano, turmaPC2);
		
		boolean response = gustavo.removerParticipante(fulano, turmaPC2);
		
		Assert.assertEquals(true, response);
	}
}
