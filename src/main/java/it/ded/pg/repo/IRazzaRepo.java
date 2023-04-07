package it.ded.pg.repo;

import it.ded.pg.model.Razza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRazzaRepo extends JpaRepository<Razza, String> {
}
