package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Big_Brothers extends Membro implements PostarMensagem {

    /**
     * Herança da classe Membro que inicializa um membro do tipo Big_Brother
     * @param nome Nome do membro
     * @param email Email do membro
     */
    public Big_Brothers(String nome, String email){
        super(nome, email, TiposMembros.Big_Brothers, Turnos.Regular);
        super.mensagem = postaMensagem();
    }


    /**
     * Decide a mensagem que vai ser postada para os membros do tipo Big_Brother baseado no turno
     * @return Retorna a mensagem a ser postada
     */
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
