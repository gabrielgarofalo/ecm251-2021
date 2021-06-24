package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;

public class Mobile_Members extends Membro{
    public Mobile_Members(String nome, String email){
        super(nome, email, TiposMembros.Mobile_Members, Turnos.Regular);
    }
}
