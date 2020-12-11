package prova1b;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class ModeradorTest {

	// Testes da classe Grupo
	
	@Test
	public void adicionarParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.adicionarParticipante(fulano, turmaOO2);
		
		Assert.assertEquals(2, turmaOO2.getParticipantes().length);
	}
	
	@Test
	public void receberMensagemParticpanteTest() {
		
		Assert.assertEquals(0, 0);
	}
	
	@Test
	public void removerParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.addicionarParticipante(fulano);
		
		gustavo.removerParticipante(fulano);
		
		Assert.assertEquals(1, turmaOO2.getParticipantes().length);
	}
	
	
	//Testes da classe Participante
	
	@Test
	public void enviarMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		
		Assert.assertEquals(1, turmaOO2.getMensagens().length());
	}
	
	// Testes da classe superParticipante

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
		
		Assert.assertEquals(4, turmaOO2.getParticipantes().length);
	}
	
	@Test
	public void criarGrupoTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Assert.assertNotNull(turmaOO2);
	}

	@Test
	public void criarGrupoComNomeTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Assert.assertEquals("Turma OO2", turmaOO2.getNome());
	}

	@Test
	public void novoGrupoComUmParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");		
		
		Assert.assertEquals("",  turmaOO2.getParticipantes());
		
	}	
	
	@Test
	public void confirmarRemocaoDeParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		gustavo.criarGrupo("Turma OO2");
		
		Usuario fulano = new Usuario("Fulano");
		gustavo.addicionarParticipante(fulano);
		
		boolean confirmacao = gustavo.removerParticipante(fulano);
		Assert.assertEquals(true, confirmacao);
	}
		
	@Test
	public void removerParticipanteSemInserirAntesTest() {
		Moderador gustavo = new Moderador("Gustavo");
		gustavo.criarGrupo("Turma OO2");
		
		boolean confirmacao = gustavo.removerParticipante(new Usuario("Fulano"));
		Assert.assertEquals(false, confirmacao);
	}
	
	//Testes da classe Usuário

	@Test
	public void grupoSemMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Assert.assertEquals(0, turmaOO2.getMensagens().length);
	}
		
	@Test
	public void enviarVariasMensagensTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		gustavo.enviarMensagem("Tudo bem?", turmaOO2);
		gustavo.enviarMensagem("Como está a prova?", turmaOO2);
		gustavo.enviarMensagem("Estudaram?", turmaOO2);
		
		Assert.assertEquals(4, turmaOO2.getMensagens());
	}
	
	@Test
	public void lerUltimaMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviarMensagem("Oi pessoal", turmaOO2);
		gustavo.enviarMensagem("Tudo bem?", turmaOO2);
		gustavo.enviarMensagem("Como está a prova?", turmaOO2);
		gustavo.enviarMensagem("Estudaram?", turmaOO2);
		
		Mensagem ultima = turmaOO2.getMensagens()[turmaOO2.getMensagens().length-1];
		
		Assert.assertEquals("Estudaram?", ultima.getMensage());
	}

}
