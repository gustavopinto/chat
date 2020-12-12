package prova1b;

public class Main {
	public static void main(String[] args) {
		// Criando moderador e participantes
		Moderador gustavo = new Moderador("Gustavo");
		Participante leonardo = new Usuario("Leonardo");
		Participante david = new Usuario("David");

		// Criando grupo
		Grupo grupo = gustavo.criarGrupo("PC2");
		
		// Adicionando participantes ao grupo
		gustavo.adicionarParticipante(leonardo, grupo);
		gustavo.adicionarParticipante(david, grupo);
		System.out.println(grupo.getParticipantes());
		
		// Removendo participantes do grupo
		gustavo.removerParticipante(leonardo, grupo);
		System.out.println(grupo.getParticipantes());

		// Enviando mensagens
		// Moderador
		gustavo.enviarMensagem("Teste", grupo);
		
		// Participante
		david.enviarMensagem("Teste David", grupo);
		System.out.println(grupo.getMensagens());
	}
}
