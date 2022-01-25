public class Planina {
    private String ime;
    private String nazivDrzave;
    private int visinaPlanine;

    public Planina() {
    }

    public Planina(String ime, String nazivDrzave, int visinaPlanine) {
        this.ime = ime;
        this.nazivDrzave = nazivDrzave;
        this.visinaPlanine = visinaPlanine;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getNazivDrzave() {
        return nazivDrzave;
    }

    public void setNazivDrzave(String nazivDrzave) {
        this.nazivDrzave = nazivDrzave;
    }

    public int getVisinaPlanine() {
        return visinaPlanine;
    }

    public void setVisinaPlanine(int visinaPlanine) {
        this.visinaPlanine = visinaPlanine;
    }
}
