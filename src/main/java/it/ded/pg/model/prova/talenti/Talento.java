package it.ded.pg.model.prova.talenti;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Talento {

    private String titolo;
    private List<String> prerequisito;
    private String beneficio;
}
