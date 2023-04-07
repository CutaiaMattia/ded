package it.ded.pg.service.serviceInterface;

import it.ded.pg.model.Incantesimo;
import it.ded.pg.model.Pg;

import java.util.List;

public interface IPgService {
    public Pg showAllInfoByidPg(int idPg);
    public List<Incantesimo> getIncantesimiByClasseAndLvl(String classe, int lvl);

}
