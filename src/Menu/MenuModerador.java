package Menu;

public class MenuModerador implements Menu {
    @Override
    public void imprimir() {
        System.out.println(
            "MENU DO MODERADOR\n" +
            "1 - Criar um grupo\n" +
            "2 - Adicionar participante\n" +
            "3 - Remover participante\n" +
            "4 - Mostrar dados do grupo\n" +
            "5 - Ver as mensagens do grupo\n" +
            "6 - Enviar uma mensagem\n" +
            "< - Voltar"
        );
    }
}
