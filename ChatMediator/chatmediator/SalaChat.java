package chatmediator;

import java.util.ArrayList;
import java.util.List;

public class SalaChat implements ChatMediador {
    private List<Usuario> usuarios;

    public SalaChat() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public void adicionarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    @Override
    public void enviarMensagem(String msg, Usuario remetente) {
        for (Usuario u : usuarios) {
            if (u != remetente) {
                u.receber(msg);
            }
        }
    }
}
