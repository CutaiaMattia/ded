package it.ded.pg.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "razza")
public class Razza {

    @Id
    String nome;



    String linguaggi;
    int velocita;
    String note;


    @OneToMany
    @JsonManagedReference(value = "razza_nome")
    @JoinColumn(name = "razza_nome")
    List<TrattoRazziale> trattiRazziali;

}
