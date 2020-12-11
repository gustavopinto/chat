package prova1b;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Teste {

	@Test
	public void criarGrupoTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Assertions.assertEquals(turmaOO2.getNome(), "Turma OO2");
		
	}

}
