package it.ded.pg.service;


import it.ded.pg.model.Incantesimo;
import it.ded.pg.model.Pg;
import it.ded.pg.repo.IIncantesimoRepo;
import it.ded.pg.repo.IPgRepo;
import it.ded.pg.service.serviceInterface.IPgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PgService implements IPgService {


    @Autowired
    private IPgRepo iPgRepo;

    @Autowired
    private IIncantesimoRepo iIncantesimoRepo;



    @Override
    public Pg showAllInfoByidPg( int idPg){
        if(iPgRepo.findById(idPg).isPresent()){
            return iPgRepo.findById(idPg).get();
        }
        return null;
    }

    @Override
    public List<Incantesimo> getIncantesimiByClasseAndLvl(String classe, int lvl){
        return   iIncantesimoRepo.findByClasseAndLvl(classe,lvl);


    }

}
