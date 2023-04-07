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
@Table(name = "livello_classe")
public class LivelloClasse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String classe;
    int bab;
    int tempra;
    int riflessi;
    int volonta;
    int magia1;
    int magia2;
    int magia3;
    int magia4;
    int magia5;
    int magia6;
    int magia7;
    int magia8;
    int magia9;



}
