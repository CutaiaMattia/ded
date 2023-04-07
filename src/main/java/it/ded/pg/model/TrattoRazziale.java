package it.ded.pg.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
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
@Table(name = "tratto_razziale")
public class TrattoRazziale {

    @Id
    String titolo;

    @ManyToOne
    @JoinColumn(name = "razza_nome")
    @JsonBackReference(value = "razza_nome")
    Razza razza;
    String descrizione;
}
