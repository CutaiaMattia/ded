package it.ded.pg.model.prova.capacita;

import it.ded.pg.model.prova.modelliGenerici.Magie;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class MagieMagoEStregone extends Magie {
    private String scuola;

    public MagieMagoEStregone(String scuola, String nome, String descrzione) {
        super(nome, descrzione);
        this.scuola = scuola;
    }


}

