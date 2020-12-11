package prova1b;

import org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;



public class ModeradorTest {

	@Test
	public void criarGrupoTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Assertions.assertNotNull(turmaOO2);
		
	}

	@Test
	public void criarGrupoComNomeTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Assertions.assertEquals("Turma OO2", turmaOO2.getNome());
	}

	@Test
	public void novoGrupoComUmParticipanteTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Assertions.assertEquals(1, turmaOO2.getParticipantes().size());
		
		Assertions.assertEquals("Gustavo", ((Participante) turmaOO2.getParticipantes().get(0)).getNome());
	}
	
	
	@Test
	public void adicionarParticipanteTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario fulano = null;
		
		try {
			fulano = new Usuario("Fulano");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		gustavo.adicionarParticipante(fulano);
		
		Assertions.assertEquals(2, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void adicionarVariosParticipantesTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario fulano = null;
		
		try {
			fulano = new Usuario("Fulano");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario beltrano = null;
		
		try {
			beltrano = new Usuario("Beltrano");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario ciclano = null;
		
		try {
			ciclano = new Usuario("Ciclano");
		} catch (StringVazia e) {
			e.printStackTrace();
		}	
		
		gustavo.adicionarParticipante(fulano);
		gustavo.adicionarParticipante(beltrano);
		gustavo.adicionarParticipante(ciclano);
		
		Assertions.assertEquals(4, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void removerParticipanteTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
		 	turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario fulano = null;
		
		try {
			fulano = new Usuario("Fulano");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.adicionarParticipante(fulano);
		
		gustavo.removerParticipante(fulano);
		
		Assertions.assertEquals(1, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void confirmarRemocaoDeParticipanteTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		try {
			gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario fulano = null;
		
		try {
			fulano = new Usuario("Fulano");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.adicionarParticipante(fulano);
		
		boolean confirmacao = gustavo.removerParticipante(fulano);
		
		Assertions.assertEquals(true, confirmacao);
	}
	
	
	@Test
	public void removerParticipanteSemInserirAntesTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		try {
			gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		boolean confirmacao = false;
		
		try {
			confirmacao = gustavo.removerParticipante(new Usuario("Fulano"));
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Assertions.assertEquals(false, confirmacao);
	}
	
	@Test
	public void grupoSemMensagemTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Assertions.assertEquals(0, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void enviarMensagemTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		
		Assertions.assertEquals(1, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void dataHoraMensagemTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		
		String dataHoraAtual = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());
		
		Assertions.assertEquals(dataHoraAtual, (turmaOO2.getMensagens().get(0)).getDataHora());
	}
	
	@Test
	public void enviarVariasMensagensTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		gustavo.enviaMensagem("Tudo bem?", turmaOO2);
		gustavo.enviaMensagem("Como está a prova?", turmaOO2);
		gustavo.enviaMensagem("Estudaram?", turmaOO2);
		
		Assertions.assertEquals(4, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void lerUltimaMensagemTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.enviaMensagem("Oi pessoal", turmaOO2);
		gustavo.enviaMensagem("Tudo bem?", turmaOO2);
		gustavo.enviaMensagem("Como está a prova?", turmaOO2);
		gustavo.enviaMensagem("Estudaram?", turmaOO2);
		
		Mensagem ultima = turmaOO2.getMensagens().get(3);
		
		Assertions.assertEquals("Moderador: Estudaram?", ultima.getMensagem());
	}
	
	@Test
	public void enviarMensagemVaziaModeradorTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.enviaMensagem("", turmaOO2);
		
		Assertions.assertEquals(1, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void enviarMensagemVaziaUsuarioTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario usuario = null;
		
		try {
			usuario = new Usuario("Jhoy");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		try {
			turmaOO2.adicionarParticipante(usuario);
		} catch (ParticipanteRepetido e) {
			e.printStackTrace();
		}
		
		usuario.enviaMensagem("", turmaOO2);
		
		Assertions.assertEquals(1, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void adicionarParticipanteRepetidoTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("Turma OO2");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Usuario fulano = null;
		
		try {
			fulano = new Usuario("Fulano");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		gustavo.adicionarParticipante(fulano);
		gustavo.adicionarParticipante(fulano);
		
		Assertions.assertEquals(2, turmaOO2.getParticipantes().size());
	}
	
	@Test
	public void criarGrupoSemNomeTest() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("Gustavo");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		Grupo turmaOO2 = null;
		
		try {
			turmaOO2 = gustavo.criarGrupo("");
		} catch (StringVazia e) {
			e.printStackTrace();
		}
		
		Assertions.assertNull(turmaOO2);
		
	}
	
	@Test
	public void moderadorSemNome() {
		Moderador gustavo = null;
		
		try {
			gustavo = new Moderador("");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		
		Assertions.assertNull(gustavo);
		
	}
	
	@Test
	public void usuarioSemNome() {
		Usuario gustavo = null;
		
		try {
			gustavo = new Usuario("");
		} catch (StringVazia e1) {
			e1.printStackTrace();
		}
		
		
		Assertions.assertNull(gustavo);		
	}
}
