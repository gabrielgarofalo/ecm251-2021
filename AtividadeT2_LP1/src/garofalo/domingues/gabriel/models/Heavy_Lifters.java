package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;

public class Heavy_Lifters extends Membro{
    public Heavy_Lifters(String nome, String email){
        super(nome, email, TiposMembros.Heavy_Lifters, Turnos.Regular);
    }
}
