package it.ded.pg.model;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "talento")
public class Talento {

    @Id
    private String titolo;
    private String benefici;

    @ManyToOne
    @JoinColumn(name = "id_pg")
    @JsonBackReference(value = "id_pg")
    private Pg idPg;
    private String descrizione;
}
