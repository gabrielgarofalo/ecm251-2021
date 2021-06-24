package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Big_Brothers extends Membro implements PostarMensagem {

    public Big_Brothers(String nome, String email){
        super(nome, email, TiposMembros.Big_Brothers, Turnos.Regular);
        super.mensagem = postaMensagem();
    }

    @Override
    public String postaMensagem() {
        if (this.getHorario() == Turnos.Regular){
            return "Sempre ajudando as pessoas e membros ou não S2!";
        }
        else{
            return "...";
        }
    }
}
