package it.ded.pg.model.prova.mago;

import it.ded.pg.model.prova.modelliGenerici.Competenze;
import it.ded.pg.model.prova.modelliGenerici.Tab;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InizializzazioneClasseMago {

  private Tab magovLl1 =null;
  private Tab magoLvl2 =null;
  private Tab magoLvl3 =null;
  private Tab magoLvl4 =null;
  private Tab magoLvl5 =null;
  private Tab magoLvl6 =null;
  private Tab magoLvl7 =null;
  private Tab magoLvl8 =null;
  private Tab magoLvl9 =null;
  private Tab magoLvl10 = null;
  private Tab magoLvl11 = null;
  private Tab magoLvl12 = null;
  private Tab magoLvl13 = null;
  private Tab magoLvl14 = null;
  private Tab magoLvl15 = null;
  private Tab magoLvl16 = null;
  private Tab magoLvl17 = null;
  private Tab magoLvl18 = null;
  private Tab magoLvl19 = null;
  private Tab magoLvl20 = null;

  private List<Competenze> competenze = new ArrayList<>();


  private List<String> speciale1L =new ArrayList<>();
  private List<String> speciale5L =new ArrayList<>();
  private List<String> speciale10L =new ArrayList<>();
  private List<String> speciale15L =new ArrayList<>();
  private List<String> speciale20L =new ArrayList<>();



    public void inizzazioneMago() {
        speciale1L = List.of("Evocare famiglio", "Scrivere pergamene");
        speciale5L = List.of("Talento bonus");
        speciale10L = List.of("Talento bonus");
        speciale15L = List.of("Talento bonus");
        speciale20L = List.of("Talento bonus");


         magovLl1 = new Mago("0", 0, 0, 2, speciale1L, 3, 1, 0, 0, 0, 0, 0, 0, 0, 0);
         magoLvl2 = new Mago("1", 0, 0, 3, null, 4, 2, 0, 0, 0, 0, 0, 0, 0, 0);
         magoLvl3 = new Mago("1", 1, 1, 3, null, 4, 2, 1, 0, 0, 0, 0, 0, 0, 0);
         magoLvl4 = new Mago("2", 1, 1, 4, null, 4, 3, 2, 0, 0, 0, 0, 0, 0, 0);
         magoLvl5 = new Mago("2", 1, 1, 4, speciale5L, 4, 3, 2, 1, 0, 0, 0, 0, 0, 0);
         magoLvl6 = new Mago("3", 2, 2, 5, null, 4, 3, 3, 2, 0, 0, 0, 0, 0, 0);
         magoLvl7 = new Mago("3", 2, 2, 5, null, 4, 4, 3, 2, 1, 0, 0, 0, 0, 0);
         magoLvl8 = new Mago("4", 2, 2, 6, null, 4, 4, 3, 3, 2, 0, 0, 0, 0, 0);
         magoLvl9 = new Mago("4", 3, 3, 6, null, 4, 4, 4, 3, 2, 1, 0, 0, 0, 0);
         magoLvl10 = new Mago("5", 3, 3, 7, speciale10L, 4, 4, 4, 3, 3, 2, 0, 0, 0, 0);
         magoLvl11 = new Mago("5", 3, 3, 7, null, 4, 4, 4, 4, 3, 2, 1, 0, 0, 0);
         magoLvl12 = new Mago("6/1", 4, 4, 8, null, 4, 4, 4, 4, 3, 3, 2, 0, 0, 0);
         magoLvl13 = new Mago("6/1", 4, 4, 8, null, 4, 4, 4, 4, 4, 3, 2, 1, 0, 0);
         magoLvl14 = new Mago("7/2", 4, 4, 9, null, 4, 4, 4, 4, 4, 3, 3, 2, 0, 0);
         magoLvl15 = new Mago("7/2", 5, 5, 9, speciale15L, 4, 4, 4, 4, 4, 4, 3, 2, 1, 0);
         magoLvl16 = new Mago("8/3", 5, 5, 10, null, 4, 4, 4, 4, 4, 4, 3, 3, 2, 0);
         magoLvl17 = new Mago("8/3", 5, 5, 10, null, 4, 4, 4, 4, 4, 4, 4, 3, 2, 1);
         magoLvl18 = new Mago("9/4", 6, 6, 11, null, 4, 4, 4, 4, 4, 4, 4, 3, 3, 2);
         magoLvl19 = new Mago("9/4", 6, 6, 11, null, 4, 4, 4, 4, 4, 4, 4, 4, 3, 3);
         magoLvl20 = new Mago("10/5", 6, 6, 12, speciale20L, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4);



         competenze.add(new Competenze("Competenza nelle armi e nelle armature", List.of(
                 "I maghi sono competenti nella balestra leggera, balestra pesante, bastone ferrato, pugnale e randello.", "Non sono competenti in alcun tipo di armatura, né negli scudi.","Un'armatura di qualsiasi tipo interferisce con i movimenti del mago e può provocare il fallimento degli intesimi con componenti somatiche")));
         competenze.add(new Competenze("Incantesimi", List.of(
                 "Un mago lancia gli incantesimi arcani.","Il mago deve scegliere e preparare i suoi incantesimi in anticipo (vedi sotto).","Per imparare, preparare o lanciare un incantesimo, un mago deve avere un punteggio di intelligenza almeno pari a 10 + il livello dell'incantesimo (int 10 per incantesimi di livello 0, Int 11 per incantesimi di primo livello, e così via).","La Classe Difficoltà per un tiro salvezza contro un incantesimo da mago è 10 + il livello dell'incantesimo + il modificatore di Intelligenza del mago.","I maghi possono conoscere qualsiasi numero di incantesimi.","Un mago deve preparare in precedenza gli incantesimi dormendo per una notte intera e impiegando 1 ora nello studio del suo libro degli incantesimi .")));
         competenze.add(new Competenze("Linguaggi bonus", List.of(
                 "Un mago può sostituire il Draconico ad uno dei linguaggi bonus a disposizione del personaggio per la sua razza")));
         competenze.add(new Competenze("Famiglio",List.of(" Un mago può ottenere un famiglio ")));
         competenze.add(new Competenze("Scrivere pergamene",List.of(
                 "Un mago guadagna Scrivere Pergamene come talento bonus.","Questo talento gli permette di creare pergamene magiche")));
         competenze.add(new Competenze("Talenti bonus",List.of(
                 "Al 5°, 10°, 15° e 20° livello un mago acquisisce un talento bonus.","Questo talento deve essere un talento di metamagia, un talento di creazione oggetto oppure Padronanza degli Incantesimi")));

         competenze.add(new Competenze("Libro degli incantesimi", List.of(
                 "I maghi devono studiare i loro libri degli incantesimi ogni giorno per preparare gli incantesimi.","Un mago non può preparare incantesimi che non sono presenti sul suo libro, tranne lettura del magico che tutti i maghi possono preparare a memoria.","Un mago comincia con un libro degli incantesimi che contiene tutti gli incantesimi da mago di livello 0 (eccetto quelli dalla scuola o scuole proibite, se ne ha).","Ogni volta che il mago raggiunge un nuovo livello, guadagna 2 nuovi incantesimi di qualsiasi livello o livelli che è in grado di lanciare")));

         competenze.add(new Competenze("Scuole di specializzazione", List.of(
                 "La specializzazione permette al mago di lanciare incantesimi extra dalla scuola scelta, tuttavia egli non imparerà mai a lanciare incantesimi da alcune altre scuole.",
                 "Ogni giorno il mago specialista può preparare un incantesimo addizionale (della scuola selezionata come specialità) per livello di incantesimo.",
                 "Lo specialista guadagna un bonus di +2 alle prove di Sapienza Magica per imparare gli incantesimi della scuola scelta.",
                 "In questo caso deve scegliere quali due scuole di magia rinunciare (a meno che non scelga di specializzarsi nella divinazione) che diverranno le sue scuole proibite e non può neanche lanciare questi incantesimi da pergamene o bacchette.",
                 "Le otto scuole di magia arcana sono abiurazione, ammaliamento, divinazione, evocazione, illusione, invocazione, necromanzia e trasmutazione.",
                 "Gli incantesimi che non rientrano in queste scuole sono chiamati incantesimi universali.",
                 "-Abiurazione :","Incantesimi che proteggono, bloccano o bandiscono. Uno specialista dell'abiurazione è chiamato abiuratore ." ,
                 "-Ammaliamento :","Incantesimi che infondono nel ricevente qualche qualità o garantiscono al mago il potere sudi un altro essere. Uno specialista dell'ammaliamento è chiamato ammaliatore.",
                 "-Divinazione:","Incantesimi che rivelano informazioni . Uno specialista della divinazione è chiamato divinatore. A differenza degli altri specialisti un divinatore deve rinunciare a una sola scuola.",
                 "-Evocazione :","Incantesimi che portano creature o materiali all'incantatore . Uno specialista dell'evocazione è chiamato evocatore.",
                 "-Illusione :","Incantesimi che alterano la percezione o creano immagini false. Uno specialista dell'illusione è chiamato illusionista.",
                 "-Invocazione :","Incantesimi che manipolano l'energia o creano qualcosa dal nulla. Uno specialista dell'invocazione è chiamato invocatore.",
                 "-Necromanzia:","Incantesimi che manipolano, creano o distruggono la vita o la forza vitale . Uno specialista della necromanzia è chiamato necromante.",
                 "-Trasmutazione:","Incantesimi che trasformano fisicamente il ricevente o cambiano le sue caratteristiche in modo più sofisticato. Uno specialista della trasmutazione è chiamato trasmutatore.",
                 "-Universale:","Non una scuola ma una categoria di incantesimi che tutti i maghi possono imparare; un mago non può selezionare questa scuola come scuola di specializzazione o come scuola a cui non ha accesso. Solo un piccolo numero di incantesimi ricade in questa categoria .")));




    }







    static String testo ="" ;

   static void createInstanceToCopy(String testo){
        String scuola = "";
       for(String singolaRiga : testo.split("\n")){
           if(!singolaRiga.contains(":")){
                scuola=singolaRiga.trim();
           }else {
               String nome = singolaRiga.substring(0,   singolaRiga.indexOf(":")).trim();
               String descrizione = singolaRiga.substring(singolaRiga.indexOf(":")+1, singolaRiga.length()-1).trim();

               System.out.println(" lvl9.add(new Magie(\"" +scuola+"\",\""+nome+"\",\""+descrizione+"\"));");
           }

       }

    }
    public static void main(String[] args) {
        createInstanceToCopy(testo);

    }
}




