import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ModeradorTest {

    @Test
    void criarGrupoTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
        assertNotNull(turmaOO2);
    }

    @Test
    void criarGrupoComNomeTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
        assertEquals("Turma OO2", turmaOO2.getNome());
    }

    @Test
    void novoGrupoComUmParticipanteTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        assertEquals(1, turmaOO2.getParticipantes().length);
        assertEquals("Gustavo", turmaOO2.getParticipantes()[0].getNome());
    }

    @Test
    void adicionarParticipanteTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        Usuario fulano = new Usuario("Fulano");
        gustavo.adicionarParticipante(fulano);

        assertEquals(2, turmaOO2.getParticipantes().length);
    }

    @Test
    void adicionarVariosParticipantesTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        Usuario fulano = new Usuario("Fulano");
        gustavo.adicionarParticipante(fulano);

        Usuario beltrano = new Usuario("Beltrano");
        gustavo.adicionarParticipante(beltrano);

        Usuario ciclano = new Usuario("Ciclano");
        gustavo.adicionarParticipante(ciclano);

        assertEquals(4, turmaOO2.getParticipantes().length);
    }

    @Test
    void removerParticipanteTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        Usuario fulano = new Usuario("Fulano");
        gustavo.adicionarParticipante(fulano);

        gustavo.removerParticipante(fulano);
        assertEquals(1, turmaOO2.getParticipantes().length);
    }

    @Test
    void confirmarRemocaoDeParticipanteTest() {
        Moderador gustavo = new Moderador("Gustavo");
        gustavo.criarGrupo("Turma OO2");

        Usuario fulano = new Usuario("Fulano");
        gustavo.adicionarParticipante(fulano);

        boolean confirmacao = gustavo.removerParticipante(fulano);
        assertTrue(confirmacao);
    }

    @Test
    void removerParticipanteSemInserirAntesTest() {
        Moderador gustavo = new Moderador("Gustavo");
        gustavo.criarGrupo("Turma OO2");

        boolean confirmacao = gustavo.removerParticipante(new Usuario("Fulano"));
        assertFalse(confirmacao);
    }

    @Test
    void grupoSemMensagemTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        assertEquals(0, turmaOO2.getMensagens().length);
    }

    @Test
    void enviarMensagemTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
        gustavo.enviaMensagem("Oi pessoal", turmaOO2);

        assertEquals(1, turmaOO2.getMensagens().length);
    }

    @Test
    void enviarVariasMensagensTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");
        gustavo.enviaMensagem("Oi pessoal", turmaOO2);
        gustavo.enviaMensagem("Tudo bem?", turmaOO2);
        gustavo.enviaMensagem("Como está a prova?", turmaOO2);
        gustavo.enviaMensagem("Estudaram?", turmaOO2);

        assertEquals(4, turmaOO2.getMensagens().length);
    }

    @Test
    void lerUltimaMensagemTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        gustavo.enviaMensagem("Oi pessoal", turmaOO2);
        gustavo.enviaMensagem("Tudo bem?", turmaOO2);
        gustavo.enviaMensagem("Como está a prova?", turmaOO2);
        gustavo.enviaMensagem("Estudaram?", turmaOO2);

        Mensagem ultima = turmaOO2.getMensagens()[turmaOO2.getMensagens().length-1];

        assertEquals("Estudaram?", ultima.getMensagem());
    }


    // NOVOS TESTES INCLUÍDOS

    @Test
    void usuarioComNome() {
        Usuario gustavo = new Usuario("Gustavo");

        assertEquals("Gustavo", gustavo.getNome());
    }

    @Test
    void moderadosComGrupo() {
        Moderador gustavo = new Moderador("Gustavo");
        gustavo.criarGrupo("Turma OO2");

        assertNotNull(gustavo.getGrupo());
    }

    @Test
    void naoAdicionarParticipanteDuplicado() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        Usuario fulano = new Usuario("Fulano");

        gustavo.adicionarParticipante(fulano);
        gustavo.adicionarParticipante(fulano);
        gustavo.adicionarParticipante(fulano);

        assertEquals(2, turmaOO2.getParticipantes().length);
    }

    @Test
    void horarioDaMensagemTest() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        gustavo.enviaMensagem("Oi pessoal", turmaOO2);
        Mensagem ultima = turmaOO2.getMensagens()[turmaOO2.getMensagens().length-1];

        assertNotNull(ultima.getDataHora());
    }

    @Test
    void listaDeMensagem() {
        Moderador gustavo = new Moderador("Gustavo");
        Grupo turmaOO2 = gustavo.criarGrupo("Turma OO2");

        gustavo.enviaMensagem("Oi pessoal", turmaOO2);
        gustavo.enviaMensagem("Tudo bem?", turmaOO2);
        gustavo.enviaMensagem("Como está a prova?", turmaOO2);
        gustavo.enviaMensagem("Estudaram?", turmaOO2);

        assertEquals(4, gustavo.getGrupo().getMensagens().length);
    }
}
