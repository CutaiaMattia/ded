package it.ded.pg.model.prova.talenti;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class InizializzazioneTalenti {

    List<Talento> talenti = new ArrayList<>();

    public void inizializzaTalenti(){
        talenti.add(new Talento("Abilità Focalizzata",List.of("-"),
                "Bonus di +3 alle prove dell'abilità prescelta"));
        talenti.add(new Talento("Acrobatico",List.of("-"),
                "Bonus di +2 alle prove di Acrobazia e Saltare"));
        talenti.add(new Talento("Affinità Animale",List.of("-"),
                "Bonus di +2 alle prove di Addestrare Animali e Cavalcare"));
        talenti.add(new Talento("Agile",List.of("-"),
                "Bonus di +2 alle prove di Artista della Fuga e Equilibrio"));
        talenti.add(new Talento("Allerta",List.of("-"),
                "Bonus di +2 alle prove di Ascoltare e Osservare"));
        talenti.add(new Talento("Arma Accurata",List.of("Competenza nell'arma, bonus di attacco base +1"),
                "Utilizza il modificatore di Des invece di quello di For ai tiri per colpire con le armi leggere"));
        talenti.add(new Talento("Arma Focalizzata",List.of("Competenza nell'arma prescelta"," bonus di attacco base + 1"),
                "Bonus di +1 ai tiri per colpire con l'arma prescelta"));
        talenti.add(new Talento("Arma Specializzata",List.of("Competenza nell'arma prescelta", "Arma Focalizzata nell'arma prescelta"," guerriero di 4° livello"),
                "Bonus di +2 ai danni con l'arma prescelta"));
        talenti.add(new Talento("Arma Focalizzata Superiore",List.of("Competenza nell'arma prescelta", "Arma Focalizzata nell'arma prescelta"," guerriero di 8° livello"),
                "Bonus di +2 ai tiri per colpire con l'arma prescelta"));
        talenti.add(new Talento("Arma Specializzata Superiore",List.of("Competenza nell'arma prescelta", "Arma Focalizzata nell'arma prescelta", "Arma Focalizzata Superiore nell'arma prescelta" ," Arma Specializzata nell'arma prescelta"," guerriero di 12° livello"),
                "Bonus di +4 ai danni con l'arma prescelta"));
        talenti.add(new Talento("Atletico",List.of("-"),
                "Bonus di +2 alle prove di Nuotare e Scalare"));
        talenti.add(new Talento("Attacco Poderoso",List.of("For 13"),
                "Scambia il bonus all'attacco con i danni (fino al bonus di attacco base )"));
        talenti.add(new Talento("Incalzare",List.of("For 13"," Attacco Poderoso"),
                " Un attacco in mischia extra per un avversario abbattuto"));
        talenti.add(new Talento("Incalzare Potenziato",List.of("For 13", "Attacco Poderoso", "Incalzare","bonus di attacco base +4"),
                "Nessun limite agli attacchi di incalzare per ogni round"));
        talenti.add(new Talento("Oltrepassare Migliorato",List.of("For 13"," Attacco Poderoso"),
                "Bonus di +4 ai tentativi di buttare a terra"));
        talenti.add(new Talento("Spezzare Migliorato",List.of("For 13"," Attacco Poderoso"),
                "Bonus di +4 ai tentativi di colpire un oggetto ; nessun attacco di opportunità"));
        talenti.add(new Talento("Spingere Migliorato",List.of("For 13"," Attacco Poderoso"),
                "Bonus di +4 ai tentativi di spingere; nessun attacc o di opportunità"));
        talenti.add(new Talento("Aumentare Evocazione",List.of("Incantesimi Focalizzati (evocazione)"),
                "Le creature evocate ottengono +4 For, +4 Cos"));
        talenti.add(new Talento("Autorità",List.of("Personaggio di 6° livello"),
                "Chiama a raccolta gregari e seguaci"));
        talenti.add(new Talento("Autosufficiente",List.of("-"),
                "Bonus di +2 alle prove di Guarire e Sopravvivenza"));
        talenti.add(new Talento("Colpo Senz'Armi Migliorato",List.of("-"),
                "È considerato armato anche senz'armi"));
        talenti.add(new Talento("Deviare Frecce",List.of("Des 13","Colpo Senz'Armi Migliorato"),
                "Devia un attacco a distanza al round"));
        talenti.add(new Talento("Afferrare Frecce",List.of("Des 15", "Colpo Senz'Armi Migliorato", "Deviare Frecce"),
                "Afferra un attacco a distanza deviato"));
        talenti.add(new Talento("Lottare Migliorato",List.of("Des 13", "Colpo Senz'Armi Migliorato"),
                "Bonus di +4 alle prove di lottare; nessun attacco di opportunità"));
        talenti.add(new Talento("Pugno Stordente",List.of("Des 13", "Sag 13", "Colpo Senz'Armi Migliorato", "bonus di attacco base +8"),
                "Stordisce l'avversario con un attacco senz'armi"));
        talenti.add(new Talento("Combattere alla Cieca",List.of("-"),
                "Ripete il tiro percentuale fallito contro l'occultamento"));
        talenti.add(new Talento("Combattere con Due Armi",List.of("Des 15"),
                "Riduce di 2 le penalità per combattere con due armi"));
        talenti.add(new Talento("Combattere con Due Armi Migliorato",List.of("Des 17", "Combattere con Due Armi ", "bonus di attacco base +6"),
                "Ottiene un secondo attacco con la mano secondaria"));
        talenti.add(new Talento("Combattere con Due Armi Superiore",List.of("Des 19", "Combattere con Due Armi", "Combattere con Due Armi Migliorato", "bonus di attacco base +11"),
                "Ottiene un terzo attacco con la mano secondaria"));
        talenti.add(new Talento("Difendere con Due Armi",List.of("Des 15", "Combattere con Due Armi"),
                "La mano secondaria conferisce un bonus di scudo +1 alla CA"));
        talenti.add(new Talento("Combattere in Sella",List.of("Cavalcare 1 grado"),
                "Nega gli attacchi alla cavalcatura con una prova di Cavalcare"));
        talenti.add(new Talento("Attacco in Sella",List.of("Cavalcare 1 grado", "Combattere in Sella"),
                "Si muove prima e dopo una carica in sella"));
        talenti.add(new Talento("Carica Devastante",List.of("Cavalcare 1 grado", "Attacco in Sella", "Combattere in Sella"),
                "Raddoppia i danni con una carica in sella"));
        talenti.add(new Talento("Tirare in Sella",List.of("Cavalcare 1 grado", "Combattere in Sella"),
                "Dimezza le penalità per gli attacchi a distanza in sella"));
        talenti.add(new Talento("Travolgere",List.of("Cavalcare 1 grado", "Combattere in Sella"),
                "L'avversario viene travolto dal personaggio in sella"));
        talenti.add(new Talento("Competenza nelle Armature (leggere)",List.of("-"), "Nessuna penalità di armatura alla prova ai tiri per colpire"));
        talenti.add(new Talento("Competenza nelle Armature (medie)",List.of("Competenza nelle Armature (leggere )"), "Nessuna penalità di armatura alla prova ai tiri per colpire"));
        talenti.add(new Talento("Competenza nelle Armature (pesanti)",List.of("Competenza nelle Armature (medie )"), "Nessuna penalità di armatura alla prova ai tiri per colpire"));
        talenti.add(new Talento("Competenza nelle Armi Esotiche",List.of("Bonus di attacco base + 1"), "Nessuna penalità agli attacchi con un'arma esotica"));
        talenti.add(new Talento("Competenza nelle Armi da Guerra ",List.of("-"), "Nessuna penalità agli attacchi con un'arma da guerra"));
        talenti.add(new Talento("Competenza nelle Armi Semplici",List.of("-"), "Nega la penalità di -4 agli attacchi con un'arma semplice"));
        talenti.add(new Talento("Competenza negli Scudi",List.of("-"), "Nessuna penalità di armatura alla prova al tiro per colpire"));
        talenti.add(new Talento("Attacco con lo Scudo Migliorato",List.of("Competenza negli Scudi"), "Mantiene il bonus alla CA quando colpisce con lo scudo"));
        talenti.add(new Talento("Competenza negli Scudi Torre ",List.of("Competenza negli Scudi"), "Nessuna penalità di armatura alla prova al tiro per colpire"));
        talenti.add(new Talento("Controincantesimo Migliorato",List.of("-"), "Contrasta incantesimo con un incantesimo della stessa scuola"));
        talenti.add(new Talento("Correre",List.of("-"), "Corre 5 volte più veloce della velocità normale , bonus di +4 alle prove di Saltare dopo una rincorsa"));
        talenti.add(new Talento("Critico Migliorato",List.of("Competenza nell'arma", "bonus di attacco base + 8"), "Raddoppia l'intervallo di minaccia dell'arma"));
        talenti.add(new Talento("Diligente",List.of("-"), "Bonus di +2 alle prove di Decifrare Scritture e Valutare"));
        talenti.add(new Talento("Dita Sottili",List.of("-"), "Bonus di +2 alle prove di Disattivare Congegni e Scassinare Serrature"));
        talenti.add(new Talento("Escludere Materiali",List.of("-"), "Lancia incantesimi senza le componenti materiali"));
        talenti.add(new Talento("Estrazione Rapida",List.of("Bonus di attacco base +1"), "Estrae un'arma come azione gratuita"));
        talenti.add(new Talento("Furtivo",List.of("-"), "Bonus di +2 alle prove di Muoversi Silenziosamente e Nascondersi"));
        talenti.add(new Talento("Incantare in Combattimento",List.of("-"), "Bonus di +4 alle prove di Concentrazione per lanciare incantesimi sulla difensiva"));
        talenti.add(new Talento("Incantesimi Focalizzati",List.of("-"), "Bonus di +1 alla CD di tutti i tiri salvezza contro la scuola di magia prescelta"));
      //  talenti.add(new Talento("",List.of(""), ""));
    }
}
/*


 */