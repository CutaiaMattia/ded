package it.ded.pg.controller;

import it.ded.pg.model.prova.capacita.inizializzazioneCapacita.InizializzazioneMagieMagoEStregone;
import it.ded.pg.model.prova.guerriero.InizializzazioneClasseGuerriero;
import it.ded.pg.model.prova.mago.InizializzazioneClasseMago;
import it.ded.pg.model.prova.talenti.InizializzazioneTalenti;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class PgController {

    private final InizializzazioneClasseMago icm;
    private final InizializzazioneMagieMagoEStregone ic;
    private final InizializzazioneClasseGuerriero icg;
    private final InizializzazioneTalenti it;
    PgController(){
        this.it = new InizializzazioneTalenti();
        this.it.inizializzaTalenti();
        this.icg = new InizializzazioneClasseGuerriero();
        this.icg.inizializzazioneGuerriero();
        this.ic = new InizializzazioneMagieMagoEStregone();
        this.ic.InizializzazioneMagie();
        this.icm = new InizializzazioneClasseMago();
        this.icm.inizzazioneMago();

    }


    @GetMapping("/mago/magie/{lvl}")
    public String getMagieLv0(Model model, @PathVariable int lvl){
        model.addAttribute("lv", lvl);
        switch (lvl){
            case 0: {
                model.addAttribute("magieLv", ic.getLvl0());
                break;
            }
            case 1: {
                model.addAttribute("magieLv", ic.getLvl1());
                break;
            }
            case 2: {
                model.addAttribute("magieLv", ic.getLvl2());
                break;
            }
            case 3: {
                model.addAttribute("magieLv", ic.getLvl3());
                break;
            }
            case 4: {
                model.addAttribute("magieLv", ic.getLvl4());
                break;
            }
            case 5:{
                model.addAttribute("magieLv",ic.getLvl5());
                break;
            }
            case 6:{
                model.addAttribute("magieLv",ic.getLvl6());
                break;
            }
            case 7: {
                model.addAttribute("magieLv", ic.getLvl7());
                break;
            }
            case 8:{
                model.addAttribute("magieLv",ic.getLvl8());
                break;
            }
            case 9:{
                model.addAttribute("magieLv",ic.getLvl9());
                break;
            }
        }

        return "magie";
    }

    @GetMapping("/home")
    public String getHome(Model model){
        return "home";
    }


    @GetMapping("/talenti")
    public String getTalenti(Model model){
        model.addAttribute("talenti",it.getTalenti());
        return "talenti";
    }

    @GetMapping("/{classe}/competenze")
    public String getCompetenzeMago(Model model,@PathVariable String classe){
        switch (classe){
            case "mago":{
                model.addAttribute("competenze", icm.getCompetenze());
                return "competenze";

            }
            case "guerriero":{
                model.addAttribute("competenze", icg.getCompetenze());
                return "competenze";

            }
            default: return null;
        }

    }

}
