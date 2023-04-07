package it.ded.pg.model.prova.modelliGenerici;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;


@Data
@AllArgsConstructor
public abstract class Tab {
   public String bab;
   public int tempra;
   public int riflessi;
   public int volonta;
   public List<String> speciale;






}

