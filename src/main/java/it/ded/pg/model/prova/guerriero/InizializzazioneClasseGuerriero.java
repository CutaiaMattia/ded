package it.ded.pg.model.prova.guerriero;

import it.ded.pg.model.prova.modelliGenerici.Competenze;
import it.ded.pg.model.prova.modelliGenerici.Tab;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InizializzazioneClasseGuerriero {

    private Tab guerrieroLvl1 = null;
    private Tab guerrieroLvl2 = null;
    private Tab guerrieroLvl3 = null;
    private Tab guerrieroLvl4 = null;
    private Tab guerrieroLvl5 = null;
    private Tab guerrieroLvl6 = null;
    private Tab guerrieroLvl7 = null;
    private Tab guerrieroLvl8 = null;
    private Tab guerrieroLvl9 = null;
    private Tab guerrieroLvl10 = null;
    private Tab guerrieroLvl11 = null;
    private Tab guerrieroLvl12 = null;
    private Tab guerrieroLvl13 = null;
    private Tab guerrieroLvl14 = null;
    private Tab guerrieroLvl15 = null;
    private Tab guerrieroLvl16 = null;
    private Tab guerrieroLvl17 = null;
    private Tab guerrieroLvl18 = null;
    private Tab guerrieroLvl19 = null;
    private Tab guerrieroLvl20 = null;

    private List<Competenze> competenze = new ArrayList<>();

    private List<String> speciale1L = new ArrayList<>();
    private List<String> speciale2L = new ArrayList<>();
    private List<String> speciale4L = new ArrayList<>();
    private List<String> speciale6L = new ArrayList<>();
    private List<String> speciale8L = new ArrayList<>();
    private List<String> speciale10L = new ArrayList<>();
    private List<String> speciale12L = new ArrayList<>();
    private List<String> speciale14L = new ArrayList<>();
    private List<String> speciale16L = new ArrayList<>();
    private List<String> speciale18L = new ArrayList<>();
    private List<String> speciale20L = new ArrayList<>();

    public void inizializzazioneGuerriero() {
        speciale1L = List.of("Talento bonus");
        speciale2L = List.of("Talento bonus");
        speciale4L = List.of("Talento bonus");
        speciale6L = List.of("Talento bonus");
        speciale8L = List.of("Talento bonus");
        speciale10L = List.of("Talento bonus");
        speciale12L = List.of("Talento bonus");
        speciale14L = List.of("Talento bonus");
        speciale16L = List.of("Talento bonus");
        speciale18L = List.of("Talento bonus");
        speciale20L = List.of("Talento bonus");


        guerrieroLvl1 = new Guerriero("1", 2, 0, 0, speciale1L);
        guerrieroLvl2 = new Guerriero("2", 3, 0, 0, speciale2L);
        guerrieroLvl3 = new Guerriero("3", 3, 1, 1, null);
        guerrieroLvl4 = new Guerriero("4", 4, 1, 1, speciale4L);
        guerrieroLvl5 = new Guerriero("5", 4, 1, 1, null);
        guerrieroLvl6 = new Guerriero("6/1", 5, 2, 2, speciale6L);
        guerrieroLvl7 = new Guerriero("7/2", 5, 2, 2, null);
        guerrieroLvl8 = new Guerriero("8/3", 6, 2, 2, speciale8L);
        guerrieroLvl9 = new Guerriero("9/4", 6, 3, 3, null);
        guerrieroLvl10 = new Guerriero("10/5", 7, 3, 3, speciale10L);
        guerrieroLvl11 = new Guerriero("11/6/1", 7, 3, 3, null);
        guerrieroLvl12 = new Guerriero("12/7/2", 8, 4, 4, speciale12L);
        guerrieroLvl13 = new Guerriero("13/8/3", 8, 4, 4, null);
        guerrieroLvl14 = new Guerriero("14/9/4", 9, 4, 4, speciale14L);
        guerrieroLvl15 = new Guerriero("15/10/5", 9, 5, 5, null);
        guerrieroLvl16 = new Guerriero("16/11/6/1", 10, 5, 5, speciale16L);
        guerrieroLvl17 = new Guerriero("17/12/7/2", 10, 5, 5, null);
        guerrieroLvl18 = new Guerriero("18/13/8/3", 11, 6, 6, speciale18L);
        guerrieroLvl19 = new Guerriero("19/14/9/4", 11, 6, 6, null);
        guerrieroLvl20 = new Guerriero("20/15/10/5", 12, 6, 6, speciale20L);


        competenze.add(new Competenze("Competenza nelle armi e nelle armature",List.of("Il guerriero è competente nell'uso di tutte le armi semplici e da guerra, in tutte le armature (pesanti, medie e leggere )  e negli scudi (incluso lo scudo torre).")));
        competenze.add(new Competenze("Talenti bonus",List.of(" Al 1°,2°,4°,6°,8°,10°,12°,14°,16°,18°,20° livello il guerriero riceve un talento bonus orientato al combattimento")));
    }
}
