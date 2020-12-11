import Menu.*;

import java.util.Scanner;

public class Main {
    private static Moderador moderador;
    private static Scanner scanner = new Scanner(System.in);

    private  static void criarModerador() {
        System.out.print("\nQual o nome do Moderador?\n-> ");
        String nome = scanner.nextLine();
        moderador = new Moderador(nome);

        System.out.println("\nModerador criado!\n");
    }

    private static void mostrarDadosGrupo() {
        if(moderador.getGrupo() != null) {
            System.out.println("\n" + moderador.getGrupo() + "\n");
        } else {
            System.out.println("\nPrimeiro crie um Grupo.\n");
        }
    }

    private static void mostrarMensagensGrupo() {
        if(moderador.getGrupo() == null) {
            System.out.println("\nPrimeiro crie um grupo.\n");
        } else if(moderador.getGrupo().getMensagens().length == 0) {
            System.out.println("\nEste grupo não tem mensagens!\n");
        } else {
            System.out.println("\nMENSAGENS DO GRUPO\n---------------------");
            for(Mensagem mensagem : moderador.getGrupo().getMensagens()) {
                System.out.println(mensagem);
            }
            System.out.println("---------------------\n");
        }
    }

    private static void enviarMensagem() {
        if(moderador.getGrupo() == null) {
            System.out.println("\nPrimeiro crie um grupo.\n");
        } else {
            System.out.print("\nDigite a mensagem:\n-> ");
            String msg = scanner.nextLine();
            moderador.enviaMensagem(msg, moderador.getGrupo());
        }
    }

    private static void removerParticipante() {
        System.out.print("\nQual o nome do Participante?\n-> ");
        String nomeRmv = scanner.nextLine();
        boolean removido = moderador.removerParticipante(new Usuario(nomeRmv));

        if(removido) {
            System.out.println("\n" + nomeRmv + " foi removido(a) do grupo!\n");
        } else {
            System.out.println("\n" + nomeRmv + " não está no grupo!\n");
        }
    }

    private static void adicionarParticipante() {
        System.out.print("\nQual o nome do Participante?\n-> ");
        String nomeAdd = scanner.nextLine();
        moderador.adicionarParticipante(new Usuario(nomeAdd));
        System.out.println("\n" + nomeAdd + " foi adicionado(a) ao grupo!\n");
    }

    private static void criarGrupo() {
        System.out.print("\nQual o nome do Grupo?\n-> ");
        String grupo = scanner.nextLine();
        moderador.criarGrupo(grupo);
    }

    public static void main(String[] args) {
        Menu menu = new MenuInicial();
        String opcao = "";

        moderador = new Moderador("Gustavo");
        Usuario usuario = new Usuario("Thaina");
        moderador.criarGrupo("Turma 002");
        moderador.adicionarParticipante(usuario);
        moderador.enviaMensagem("Olá, alunos!", moderador.getGrupo());
        usuario.enviaMensagem("Oi, professor!", moderador.getGrupo());

        while(opcao != "x") {
            menu.imprimir();
            System.out.println("\n-> ");
            opcao = scanner.nextLine();

            if(menu.getClass() == MenuInicial.class) {
                switch (opcao) {
                    case "1":
                        criarModerador();
                        break;
                    case "2":
                        if (moderador == null) {
                            System.out.println("Primeiro crie um Moderador!\n");
                            break;
                        }
                        menu = new MenuModerador();
                        continue;
                    case "3":
                        menu = new MenuUsuario();
                        continue;
                    case "x":
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opção inválida!\n");
                        break;
                }
            }

            if(menu.getClass() == MenuModerador.class) {
                switch (opcao) {
                    case "1":
                        criarGrupo();
                        break;
                    case "2":
                        adicionarParticipante();
                        break;
                    case "3":
                        removerParticipante();
                        break;
                    case "4":
                        mostrarDadosGrupo();
                        break;
                    case "5":
                        mostrarMensagensGrupo();
                        break;
                    case "6":
                        enviarMensagem();
                        break;
                    case "<":
                        menu = new MenuInicial();
                        continue;
                    default:
                        break;
                }
            }

            if(menu.getClass() == MenuUsuario.class) {
                switch (opcao) {
                    case "1":
                        mostrarDadosGrupo();
                        break;
                    case "2":
                        mostrarMensagensGrupo();
                        break;
                    case "3":
                        enviarMensagem();
                        break;
                    case "<":
                        menu = new MenuInicial();
                        continue;
                    default:
                        break;
                }
            }
        }

        System.out.println("Saindo...");
    }
}
