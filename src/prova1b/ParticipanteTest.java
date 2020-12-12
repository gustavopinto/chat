package prova1b;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class ParticipanteTest {
	Moderador gustavo = new Moderador("Gustavo");
	Participante fulano = new Usuario("Fulano");
	
	Grupo turma002 = gustavo.criarGrupo("Turma OO2");
	
	@Test
	void testParticipante() {
		Assert.assertNotNull(fulano);
	}

	@Test
	void testGetNome() {
		Assert.assertEquals("Fulano", fulano.getNome());
	}

}
