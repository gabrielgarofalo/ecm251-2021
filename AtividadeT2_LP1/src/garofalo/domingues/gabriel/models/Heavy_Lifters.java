package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Heavy_Lifters extends Membro implements PostarMensagem {

    public Heavy_Lifters(String nome, String email){
        super(nome, email, TiposMembros.Heavy_Lifters, Turnos.Regular);
        super.mensagem = postaMensagem();
    }

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
