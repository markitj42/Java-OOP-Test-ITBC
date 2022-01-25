import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlaninarskiDom {
    private String nazivDoma;
    private int godinaOsnivanja;
    private List<Planinar> nizPlaninara;

    public PlaninarskiDom() {

    }

    public PlaninarskiDom(String nazivDoma, int godinaOsnivanja) {
        this.nazivDoma = nazivDoma;
        this.godinaOsnivanja = godinaOsnivanja;
        this.nizPlaninara = new ArrayList<>();
    }

    public String getNazivDoma() {
        return nazivDoma;
    }

    public void setNazivDoma(String nazivDoma) {
        this.nazivDoma = nazivDoma;
    }

    public int getGodinaOsnivanja() {
        return godinaOsnivanja;
    }

    public void setGodinaOsnivanja(int godinaOsnivanja) {
        this.godinaOsnivanja = godinaOsnivanja;
    }

    public List<Planinar> getNizPlaninara() {
        return nizPlaninara;
    }

    public void uclaniPlaninara(Planinar planinar) {
        nizPlaninara.add(planinar);
    }

    public List<Planinar> brUspesnoPopetihPlaninara(Planina planina) {
        List<Planinar> uspesnoPopeli = new ArrayList<>();
        for (Planinar planinar : nizPlaninara) {
            if (planinar.uspesanUspon(planina)) {
                uspesnoPopeli.add(planinar);
                System.out.println("Uspesno se popeo takmicar: ");
                System.out.println(planinar);
            }
        }
        return uspesnoPopeli;
    }

    public void removePlaninar(int trazeniId) {
        Planinar planinarToRemove = null;
        for (Planinar planinar : nizPlaninara) {
            if (planinar.getIdentifikacioniBroj() == trazeniId) {
                planinarToRemove = planinar;
            }
        }
        if (planinarToRemove != null) {
            nizPlaninara.remove(planinarToRemove);
            System.out.println("Planinar nije vise clan naseg doma.");
            System.out.println();
        } else {
            System.out.println("Planinar sa trazenim ID-em nije u nasem domu!");
        }
    }

    public double mesecniPrihod() {
        double prihod = 0;
        for (Planinar planinar : nizPlaninara) {
            prihod += planinar.clanarina();
        }
        return prihod;
    }

    public void sortirajPlaninarePoBrojuPoena() {
        nizPlaninara.sort((planinar1, planinar2) -> (planinar2.getBrojPoena() - planinar1.getBrojPoena()));
    }

    public void stampajPodatkeDoma() {
        System.out.println("Naziv doma: " + this.nazivDoma + "\n" + "Godina osnivanja: " + this.godinaOsnivanja);
        System.out.println();
        for (Planinar planinar : nizPlaninara) {
            System.out.println("ID: " + planinar.getIdentifikacioniBroj() + "\n" + "Ime i prezime: " + planinar.getImePrezime() + " \n" + "Broj poena: " + planinar.getBrojPoena());
            System.out.println();
        }
    }
}
