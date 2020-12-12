package prova1b;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class UsuarioTest {
	

	@Test
	public void enviarMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		
		
		Assert.assertEquals("MUDE AQUI",turmaOO2.getMensagens());
	}
	
}
