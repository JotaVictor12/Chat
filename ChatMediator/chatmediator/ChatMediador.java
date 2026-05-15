package chatmediator;

public interface ChatMediador {
    void enviarMensagem(String msg, Usuario usuario);
    void adicionarUsuario(Usuario usuario);
}
