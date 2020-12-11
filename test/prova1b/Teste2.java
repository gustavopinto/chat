package prova1b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Teste2 {

	@Test
	public void novoGrupoComUmParticipanteTest() { 
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Assertions.assertEquals(1, turmaOO2.getParticipantes().size());
		
		Assertions.assertEquals("Gustavo", turmaOO2.getParticipantes().get(0).getNome());
	}
	@Test
	public void criarGrupoTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Assertions.assertNotNull(turmaOO2);
	}

	@Test
	public void criarGrupoComNomeTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Assertions.assertEquals("Turma OO2", turmaOO2.getNome());
	}
	
	@Test
	public void adicionarParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.addicionarParticipante(fulano);
		
		Assertions.assertEquals(2, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void adicionarVariosParticipantesTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.addicionarParticipante(fulano);
		
		Usuario beltrano = new Usuario("Beltrano");
		gustavo.addicionarParticipante(beltrano);
		
		Usuario ciclano = new Usuario("Ciclano");
		gustavo.addicionarParticipante(ciclano);
		
		Assertions.assertEquals(4, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void removerParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.addicionarParticipante(fulano);
		System.out.print(turmaOO2.getParticipantes());
		gustavo.removerParticipante(fulano);
		Assertions.assertEquals(1, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void confirmarRemocaoDeParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.addicionarParticipante(fulano);
		
		boolean confirmacao = gustavo.removerParticipante(fulano);
		Assertions.assertEquals(true, confirmacao);
	}
	
	
	@Test
	public void removerParticipanteSemInserirAntesTest() {
		Moderador gustavo = new Moderador("Gustavo");
		gustavo.criarGrupo("Turma OO2");
		
		boolean confirmacao = gustavo.removerParticipante(new Usuario("Fulano"));
		Assertions.assertEquals(false, confirmacao);
	}

}
