package Menu;

public class MenuInicial implements Menu {

    @Override
    public void imprimir() {
        System.out.println(
            "MENU INICIAL\n" +
            "1 - Criar Moderador\n" +
            "2 - Ver opções do Moderador\n" +
            "3 - Ver opções do Usuário comum\n" +
            "x - Sair"
        );
    }
}
