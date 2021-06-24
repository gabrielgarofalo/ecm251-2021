package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;
import garofalo.domingues.gabriel.interfaces.PostarMensagem;

public class Mobile_Members extends Membro implements PostarMensagem {
    public Mobile_Members(String nome, String email){
        super(nome, email, TiposMembros.Mobile_Members, Turnos.Regular);
    }

    @Override
    public String mensagem(Membro membro) {
        if (membro.getHorario() == Turnos.Regular){
            return "Happy Coding!";
        }
        else{
            return "Happy_C0d1ng. Maskers";
        }
    }
}
