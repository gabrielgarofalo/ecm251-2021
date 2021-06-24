package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;

public abstract class Membro {
    protected String nome_usuario;
    protected String email;
    protected TiposMembros funcao;
    protected Turnos horario;

    public Membro(String nome_usuario, String email, TiposMembros funcao, Turnos horario) {
        this.nome_usuario = nome_usuario;
        this.email = email;
        this.funcao = funcao;
        this.horario = horario;
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
