package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Big_Brothers extends Membro implements PostarMensagem {

    protected String mensagem;

    public Big_Brothers(String nome, String email){
        super(nome, email, TiposMembros.Big_Brothers, Turnos.Regular);
        this.mensagem = mensagem();
    }

    @Override
    public String mensagem() {
        if (this.getHorario() == Turnos.Regular){
            return "Sempre\n" +
                    "ajudando as pessoas membros ou não S2!";
        }
        else{
            return "...";
        }
    }
}
