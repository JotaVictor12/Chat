package chatmediator;

public abstract class Usuario {
    protected ChatMediador mediador;
    protected String nome;

    public Usuario(ChatMediador mediador, String nome) {
        this.mediador = mediador;
        this.nome = nome;
    }

    public abstract void enviar(String msg);
    public abstract void receber(String msg);
}
