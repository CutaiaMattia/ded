package it.ded.pg.model.prova.modelliGenerici;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Competenze {

   private String competenza;
   private List<String> descrizione;

}
