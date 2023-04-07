package it.ded.pg.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "incantesimo")
public class Incantesimo {
    @Id
    String titolo;

    String classe;
    int lvl;
    String descrizione;


}

