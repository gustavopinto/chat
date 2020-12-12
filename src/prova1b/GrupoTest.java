package prova1b;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class GrupoTest {
	Moderador gustavo = new Moderador("Gustavo");
	Participante fulano = new Usuario("Fulano");
	
	Grupo turma002 = gustavo.criarGrupo("Turma OO2");

	@Test
	void testGrupo() {
		Assert.assertNotNull(turma002);
	}

	@Test
	void testAdicionarAoGrupo() {
		gustavo.adicionarParticipante(fulano, turma002);
		
		String resultadoPartticipantes = "PARTICIPANTES DO GRUPO \nGustavo\nFulano\n";
		
		Assert.assertEquals(resultadoPartticipantes, turma002.getParticipantes());
	}

	@Test
	void testRemoverDoGrupo() {
		Participante sicrano = new Usuario("Sicrano");
		
		gustavo.adicionarParticipante(sicrano, turma002);
		
		boolean response = gustavo.removerParticipante(sicrano, turma002);
		
		Assert.assertEquals(true, response);
	}

	@Test
	void testReceberMensagemParticipante() {
		fulano.enviarMensagem("Enviando mensagem para teste", turma002);
		
		Assert.assertNotNull(turma002.getMensagens());
	}
}
