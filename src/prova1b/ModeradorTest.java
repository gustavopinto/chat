package prova1b;
//Alunos: Thiago Costa Maia - 201511140013 , Helder Mateus dos Reis Matos - 201904940036 

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.text.SimpleDateFormat;
import java.util.Date;

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
		
		Assertions.assertEquals("Gustavo", turmaOO2.getParticipantes().get(0).toString());
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
		
		Mensagem ultima = turmaOO2.getMensagens().get(turmaOO2.getMensagens().size()-1);
		
		Assertions.assertEquals("Estudaram?", ultima.getMensagem());
	}
	
	@Test
    public void testDataHoraEnvio() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
        gustavo.enviaMensagem("Oi pessoal", turmaOO2);

        Mensagem ultima = turmaOO2.getMensagens().get(turmaOO2.getMensagens().size()-1);

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy '�s' HH:mm z");

        Assertions.assertEquals(formatter.format(ultima.infoDataHoraEnvio()), formatter.format(new Date(System.currentTimeMillis())));
    }
	
	@Test
	public void UsuarioMensagem() {
		Moderador gustavo = new Moderador("Gustavo");
		Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
		Usuario aluno1 = new Usuario("Thiago");
		Usuario aluno2 = new Usuario ("Helder");
		gustavo.addicionarParticipante(aluno1);
		gustavo.addicionarParticipante(aluno2);
		aluno1.enviaMensagem("Prova dificil", turmaOO2);
		aluno2.enviaMensagem ("De mais", turmaOO2);
		
		Assertions.assertEquals(2, turmaOO2.getMensagens().size());
	}
	
	@Test
	public void UsuarioNome() {
		Moderador gustavo = new Moderador("Gustavo");
		gustavo.criarGrupo("Turma OO2");
		Usuario aluno1 = new Usuario("Thiago");
		gustavo.addicionarParticipante(aluno1);
		Assertions.assertEquals("Thiago", aluno1.toString());
	}
	
	@Test
    public void criarParticipanteComNomeMaiorQueDozeCaracteres() {

        Moderador gustavo = new Moderador("GustavoGustavoGustavo");        
        Assertions.assertNull(gustavo.toString());
    }	
	
	
	@Test
    public void criarGrupoComNomeMaiorQueDozeCaracteres() {

        Moderador gustavo = new Moderador("Gustavo");
        gustavo.criarGrupo("GrupoComNomeMaiorQueDozeCaracteres");
        Assertions.assertNull(gustavo.getGrupo().getNome());
    }	


}
