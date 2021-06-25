package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Heavy_Lifters extends Membro implements PostarMensagem {

    /**
     * Herança da classe Membro que inicializa um membro do tipo Heavy_Lifter
     * @param nome Nome do membro
     * @param email Email do membro
     */
    public Heavy_Lifters(String nome, String email){
        super(nome, email, TiposMembros.Heavy_Lifters, Turnos.Regular);
        super.mensagem = postaMensagem();
    }

    /**
     * Decide a mensagem que vai ser postada para os membros do tipo Heavy_Lifter baseado no turno
     * @return Retorna a mensagem a ser postada
     */
    @Override
    public String postaMensagem() {
        if (this.getHorario() == Turnos.Regular){
            return "Podem contar conosco!";
        }
        else{
            return "N00b_qu3_n_Se_r3pita.bat";
        }
    }
}
