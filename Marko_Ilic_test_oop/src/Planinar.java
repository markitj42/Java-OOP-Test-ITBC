public abstract class Planinar {
    private int identifikacioniBroj;
    private static int inkrementujId = 0;
    private String imePrezime;
    private int brojPoena;

    public Planinar(String imePrezime) {
        this.imePrezime = imePrezime;
        this.brojPoena = 0;
        inkrementujId++;
        this.identifikacioniBroj = inkrementujId;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public int getBrojPoena() {
        return brojPoena;
    }

    public void setBrojPoena(int brojPoena) {
        this.brojPoena = brojPoena;
    }

    public int getIdentifikacioniBroj() {
        return identifikacioniBroj;
    }

    public abstract double clanarina();

    public abstract boolean uspesanUspon(Planina planina);

    @Override
    public String toString() {
        return "ID: " + this.identifikacioniBroj + "\n" + "Ime i prezime: " + this.imePrezime + " \n" + "Broj poena: " + this.brojPoena + "\n";
    }
}
