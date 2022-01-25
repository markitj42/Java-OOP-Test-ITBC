public class Alpinista extends Planinar{

    public Alpinista(String imePrezime) {
        super(imePrezime);
    }

    @Override
    public double clanarina() {
        return 1500 - (getBrojPoena() * (1500 * 0.05));
    }

    @Override
    public boolean uspesanUspon(Planina planina) {
        if (planina.getVisinaPlanine() <= 4000) {
            setBrojPoena(getBrojPoena() + 1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
