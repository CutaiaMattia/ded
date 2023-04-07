package it.ded.pg.repo;

import it.ded.pg.model.TrattoRazziale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITrattoRazialeRepo extends JpaRepository<TrattoRazziale,String > {
}
