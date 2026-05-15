package chatmediator;

public class SimuladorChat {
    public static void main(String[] args) {
        ChatMediador sala = new SalaChat();

        Usuario u1 = new UsuarioChat(sala, "Usuario 1");
        Usuario u2 = new UsuarioChat(sala, "Usuario 2");

        sala.adicionarUsuario(u1);
        sala.adicionarUsuario(u2);

        u1.enviar("Mensagem inicial de Usuario 1 para Usuario 2.");
        u2.enviar("Resposta de Usuario 2 para Usuario 1.");
    }
}
