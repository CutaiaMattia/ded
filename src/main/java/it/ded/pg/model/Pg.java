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
@Table(name = "pg")
public class Pg {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "dado_vita")
    private String dv;

    @ManyToOne
    @JoinColumn(name = "id_livello_classe")
    @JsonManagedReference(value = "id_livello_classe")
    private LivelloClasse livelloClasse;

    @Column(name = "nome")
    private String nome;
    @Column(name = "cognome")
    private String cognome;

    @ManyToOne
    @JoinColumn(name = "razza")
    @JsonManagedReference(value = "razza")
    private Razza razza;


    @OneToMany
    @JsonManagedReference(value = "id_pg")
    @JoinColumn(name = "id_pg")
    private List<Talento> talenti;



}
