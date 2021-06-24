package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Script_Guys extends Membro implements PostarMensagem {

    protected String mensagem;

    public Script_Guys(String nome, String email){
        super(nome, email, TiposMembros.Script_Guys, Turnos.Regular);
        this.mensagem = mensagem();
    }

    @Override
    public String mensagem() {
        if (this.getHorario() == Turnos.Regular){
            return "Prazer em ajudar novos amigos de código!";
        }
        else{
            return "QU3Ro_S3us_r3curs0s.py";
        }
    }
}
