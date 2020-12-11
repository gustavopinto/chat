package prova1b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GrupoTest {

	@Test
	void receberVariasMensagenstest() {
		Moderador adm = new Moderador("Waldeci");
		Grupo g = adm.criarGrupo("Uniao RexPa #pas");
		Mensagem[] msg = new Mensagem[100];
		
		for(int i = 0; i < msg.length; i++) {
			msg[i] = new Mensagem("Mensagem na posicao " + i);
			g.enviarMensagem(msg[i]);
		}
		
		Assertions.assertNotNull(g.getMensagens());
	}
	
	@Test
	void criarGrupoSemParticipantestest() {	
		boolean success = true;
		try {
			Grupo g = new Grupo("Joss Labadie", null);
		} catch(ObjetoNulo e) {
			success = false;
			System.out.println(e.getMessage());
		}
		Assertions.assertEquals(false, success);
		
	}
	@Test
	void adicionarParticipanteInexistentetest() {
		Usuario user = null;
		boolean success = true;
		try {
			Grupo g = new Grupo("Joss Labadie", new Moderador("Joao Brigatti"));
			g.adicionarParticipante(user);
		} catch(ObjetoNulo e) {
			success = false;
			System.out.println(e.getMessage());
		}
		Assertions.assertEquals(false, success);
		
	}
	

}
