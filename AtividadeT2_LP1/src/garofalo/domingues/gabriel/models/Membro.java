package garofalo.domingues.gabriel.models;

public abstract class Membro {
    String nome_usuario;
    String email;
    String funcao;

    public Membro(String nome_usuario, String email, String funcao) {
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "Membro{" +
                "nome_usuario='" + nome_usuario + '\'' +
                ", email='" + email + '\'' +
                ", funcao='" + funcao + '\'' +
                '}';
    }
}
