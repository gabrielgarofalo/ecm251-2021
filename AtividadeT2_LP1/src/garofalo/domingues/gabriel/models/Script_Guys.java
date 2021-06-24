package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;

public class Script_Guys extends Membro{
    public Script_Guys(String nome, String email){
        super(nome, email, TiposMembros.Script_Guys, Turnos.Regular);
    }
}
