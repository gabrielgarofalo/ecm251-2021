package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Script_Guys extends Membro implements PostarMensagem {

    /**
     * Herança da classe Membro que inicializa um membro do tipo Script_Guys
     * @param nome Nome do membro
     * @param email Email do membro
     */
    public Script_Guys(String nome, String email){
        super(nome, email, TiposMembros.Script_Guys, Turnos.Regular);
        super.mensagem = postaMensagem();
    }

    /**
     * Decide a mensagem que vai ser postada para os membros do tipo Script_Guys baseado no turno
     * @return Retorna a mensagem a ser postada
     */
    @Override
    public String postaMensagem() {
        if (this.getHorario() == Turnos.Regular){
            return "Prazer em ajudar novos amigos de código!";
        }
        else{
            return "QU3Ro_S3us_r3curs0s.py";
        }
    }
}
