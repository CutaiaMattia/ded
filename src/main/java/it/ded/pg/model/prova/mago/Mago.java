package it.ded.pg.model.prova.mago;

import it.ded.pg.model.prova.modelliGenerici.Tab;
import lombok.Data;

import java.util.List;


public class Mago  extends Tab {
   private int magia0;
   private int magia1;
   private int magia2;
   private int magia3;
   private int magia4;
   private int magia5;
   private int magia6;
   private int magia7;
   private int magia8;
   private int magia9;


    public Mago(String bab,int tempra,int riflessi,int volonta, List<String> speciale,int magia0, int magia1, int magia2, int magia3, int magia4, int magia5, int magia6, int magia7, int magia8, int magia9) {
        super(bab, tempra, riflessi, volonta, speciale);
        this.magia0 = magia0;
        this.magia1 = magia1;
        this.magia2 = magia2;
        this.magia3 = magia3;
        this.magia4 = magia4;
        this.magia5 = magia5;
        this.magia6 = magia6;
        this.magia7 = magia7;
        this.magia8 = magia8;
        this.magia9 = magia9;

    }
}
