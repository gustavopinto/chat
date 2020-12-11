package Menu;

public class MenuUsuario implements Menu {
    @Override
    public void imprimir() {
        System.out.println(
            "MENU DO USUÁRIO\n" +
            "1 - Mostrar dados do grupo\n" +
            "2 - Ver as mensagens do grupo\n" +
            "3 - Enviar uma mensagem\n" +
            "< - Voltar"
        );
    }
}
