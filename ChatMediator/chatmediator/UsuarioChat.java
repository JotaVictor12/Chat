package chatmediator;

public class UsuarioChat extends Usuario {
    public UsuarioChat(ChatMediador mediador, String nome) {
        super(mediador, nome);
    }

    @Override
    public void enviar(String msg) {
        System.out.println(this.nome + " enviando: " + msg);
        mediador.enviarMensagem(msg, this);
    }

    @Override
    public void receber(String msg) {
        System.out.println(this.nome + " recebeu: " + msg);
    }
}
