package prova1b;

import org.junit.jupiter.api.Assertions.*;
//import org.junit.Assert;
//import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ModeradorTest {

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
	public void novoGrupoComUmParticipanteTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Assertions.assertEquals(1, turmaOO2.getParticipantes().size());
		
		Assertions.assertEquals("Gustavo", ((Participante) turmaOO2.getParticipantes().get(0)).getNome());
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
	
	@Test
	public void grupoSemMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		
		Assertions.assertEquals(0, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void enviarMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		
		Assertions.assertEquals(1, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void dataHoraMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		String dataHoraAtual = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		Assertions.assertEquals(dataHoraAtual, ((Mensagem) turmaOO2.getMensagens().get(0)).getDataHora());
	}
	
	@Test
	public void enviarVariasMensagensTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		gustavo.enviaMensagem("Tudo bem?", turmaOO2);
		gustavo.enviaMensagem("Como está a prova?", turmaOO2);
		gustavo.enviaMensagem("Estudaram?", turmaOO2);
		
		Assertions.assertEquals(4, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void lerUltimaMensagemTest() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		gustavo.enviaMensagem("Tudo bem?", turmaOO2);
		gustavo.enviaMensagem("Como está a prova?", turmaOO2);
		gustavo.enviaMensagem("Estudaram?", turmaOO2);
		
		Mensagem ultima = (Mensagem) turmaOO2.getMensagens().get(3);
		
		Assertions.assertEquals("Estudaram?", ultima.getMensagem());
	}

}
