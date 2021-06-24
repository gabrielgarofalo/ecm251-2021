package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Script_Guys extends Membro implements PostarMensagem {
    public Script_Guys(String nome, String email){
        super(nome, email, TiposMembros.Script_Guys, Turnos.Regular);
    }

    @Override
    public String mensagem(Membro membro) {
        if (membro.getHorario() == Turnos.Regular){
            return "Prazer em ajudar novos amigos de código!";
        }
        else{
            return "QU3Ro_S3us_r3curs0s.py";
        }
    }
}
