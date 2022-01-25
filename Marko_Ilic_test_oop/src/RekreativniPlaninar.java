public class RekreativniPlaninar extends Planinar{
    protected int tezinaOpreme;
    protected String nazivOkruga;
    protected int maksimalanUspon;

    public RekreativniPlaninar(String imePrezime, int tezinaOpreme, String nazivOkruga, int maksimalanUspon) {
        super(imePrezime);
        this.tezinaOpreme = tezinaOpreme;
        this.nazivOkruga = nazivOkruga;
        this.maksimalanUspon = maksimalanUspon;
    }


    @Override
    public double clanarina() {
        return 1000;
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        int umanjenjeUspona = tezinaOpreme * 50;
        if ((maksimalanUspon - umanjenjeUspona) >= planina.getVisinaPlanine()) {
            setBrojPoena(getBrojPoena() + 1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +  "Tezina opreme: " + tezinaOpreme + "\n" + "Naziv okruga: " + nazivOkruga + "\n" + "Maksimalan uspon: " + maksimalanUspon;
    }
}
