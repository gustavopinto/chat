package prova1b;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ModeradorTest {

	@Test
	public void criarGrupoTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		assertNotNull(turmaOO2);
	}

	@Test
	public void criarGrupoComNomeTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		assertEquals("Turma OO2", turmaOO2.getNome());
	}

	@Test
	public void novoGrupoComUmParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		assertEquals(1, turmaOO2.getParticipantes().size());

		assertEquals("Gustavo", turmaOO2.getParticipantes().get(0).getNome());
	}
	
	
	@Test
	public void adicionarParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.adicionarParticipante(fulano);
		
		assertEquals(2, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void adicionarVariosParticipantesTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.adicionarParticipante(fulano);
		
		Usuario beltrano = new Usuario("Beltrano");
		gustavo.adicionarParticipante(beltrano);
		
		Usuario ciclano = new Usuario("Ciclano");
		gustavo.adicionarParticipante(ciclano);
		
		assertEquals(4, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void removerParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.adicionarParticipante(fulano);
		
		gustavo.removerParticipante(fulano);
		assertEquals(1, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void confirmarRemocaoDeParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.adicionarParticipante(fulano);
		
		boolean confirmacao = gustavo.removerParticipante(fulano);
		assertTrue(confirmacao);
	}
	
	
	@Test
	public void removerParticipanteSemInserirAntesTest() {
		Moderador gustavo = new Moderador("Gustavo");
		gustavo.criarGrupo("Turma OO2");
		
		boolean confirmacao = gustavo.removerParticipante(new Usuario("Fulano"));
		assertFalse(confirmacao);
	}
	
	@Test
	public void grupoSemMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		assertEquals(0, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void enviarMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		
		assertEquals(1, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void enviarVariasMensagensTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		gustavo.enviarMensagem("Tudo bem?", turmaOO2);
		gustavo.enviarMensagem("Como está a prova?", turmaOO2);
		gustavo.enviarMensagem("Estudaram?", turmaOO2);
		
		assertEquals(4, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void lerUltimaMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		gustavo.enviarMensagem("Tudo bem?", turmaOO2);
		gustavo.enviarMensagem("Como está a prova?", turmaOO2);
		gustavo.enviarMensagem("Estudaram?", turmaOO2);
		
		Mensagem ultima = turmaOO2.getMensagens().get(turmaOO2.getMensagens().size()-1);

		
		assertEquals("Estudaram?", ultima.getMensagem());
	}

}
