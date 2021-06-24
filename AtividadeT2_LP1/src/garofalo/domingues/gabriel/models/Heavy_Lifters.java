package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Heavy_Lifters extends Membro implements PostarMensagem {

    protected String mensagem;

    public Heavy_Lifters(String nome, String email){
        super(nome, email, TiposMembros.Heavy_Lifters, Turnos.Regular);
        this.mensagem = mensagem();
    }

    @Override
    public String mensagem() {
        if (this.getHorario() == Turnos.Regular){
            return "Podem contar conosco!";
        }
        else{
            return "N00b_qu3_n_Se_r3pita.bat";
        }
    }
}
