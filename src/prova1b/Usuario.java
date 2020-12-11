package prova1b;

public class Usuario extends Participante {
    private String nome;

    public Usuario(String nome) {
        super(nome);
    }

    @Override
    void enviarMensagem(String texto, Grupo g) {
        Mensagem msg = new Mensagem(texto);
        g.enviarMensagem(msg);
    }
}
