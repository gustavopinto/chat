package prova1b;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class UsuarioTest {

	@Test
	void enviarMensagemParaGrupotest() {
		Moderador adm = new Moderador("Waldeci");
		Grupo g = adm.criarGrupo("Vakinha p/ comprar CyberPunk 2077");
		Usuario user = new Usuario("Gustavo");
		adm.addicionarParticipante(user);
		user.enviaMensagem("so tenho 10 bonoros guys :(", g);
		
		
		Assertions.assertEquals(user.getMensagens().get(0).getShortMensagem(), g.getMensagens().get(0).getShortMensagem());
	}

	@Test
	void verificarHoraMensagenstest() {
		Moderador adm = new Moderador("Waldeci");
		Grupo g = adm.criarGrupo("Vakinha p/ comprar CyberPunk 2077");
		Usuario user = new Usuario("Gustavo");
		adm.addicionarParticipante(user);
		user.enviaMensagem("Quem anima comprar um PS5 pro CA?", g);
		
		System.out.println(g.getMensagens().get(0).getFullMensagem());
		Assertions.assertEquals(user.getMensagens().get(0).getHora(), g.getMensagens().get(0).getHora());
	}
	@Test
	void verificarDataMensagenstest() {
		Moderador adm = new Moderador("Waldeci");
		Grupo g = adm.criarGrupo("Vakinha p/ comprar CyberPunk 2077");
		Usuario user = new Usuario("Gustavo");
		adm.addicionarParticipante(user);
		user.enviaMensagem("Bora convidar o professor, o cara eh gente fina", g);
		
		System.out.println(g.getMensagens().get(0).getFullMensagem());
		Assertions.assertEquals(user.getMensagens().get(0).getData(), g.getMensagens().get(0).getData());
	}
}
