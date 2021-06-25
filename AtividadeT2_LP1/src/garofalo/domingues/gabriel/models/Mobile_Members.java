package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.Apresentacao;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Mobile_Members extends Membro implements PostarMensagem {

    /**
     * Herança da classe Membro que inicializa um membro do tipo Mobile_Members
     * @param nome Nome do membro
     * @param email Email do membro
     */
    public Mobile_Members(String nome, String email){
        super(nome, email, TiposMembros.Mobile_Members, Turnos.Regular);
        super.mensagem = postaMensagem();
    }

    /**
     * Decide a mensagem que vai ser postada para os membros do tipo Mobile_Members baseado no turno
     * @return Retorna a mensagem a ser postada
     */
    @Override
    public String postaMensagem() {
        if (this.getHorario() == Turnos.Regular){
            return "Happy Coding!";
        }
        else{
            return "Happy_C0d1ng. Maskers";
        }
    }
}
