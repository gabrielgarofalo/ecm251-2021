package garofalo.domingues.gabriel.models;

import garofalo.domingues.gabriel.enumeracao.TiposMembros;
import garofalo.domingues.gabriel.enumeracao.Turnos;

public class Big_Brothers extends Membro{
    public Big_Brothers(String nome, String email){
        super(nome, email, TiposMembros.Big_Brothers, Turnos.Regular);
    }
}
