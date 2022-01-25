import java.util.List;

public class Main {
    public static void main(String[] args) {
        PlaninarskiDom dom = new PlaninarskiDom("Planinarski dom Divcibarac", 1974);
        Planina jastrebovac = new Planina("Jastrebovac", "Srbija", 3500);

        dom.uclaniPlaninara(new RekreativniPlaninar("Srdjan Stankovic" , 15, "Valjevo", 2400));
        dom.uclaniPlaninara(new RekreativniPlaninar("Maja Nikolic" , 10, "Divcibare", 2500));
        dom.uclaniPlaninara(new RekreativniPlaninar("Aleksandar Petrovic" , 30, "Krusevac", 3000));

        Alpinista nemanja = new Alpinista("Nemanja Zdravkovic");
        Alpinista marko = new Alpinista("Marko Ilic");
        dom.uclaniPlaninara(new Alpinista("Sanja Vasiljevic"));
        dom.uclaniPlaninara(new Alpinista("Beli Mag"));
        Alpinista pedja = new Alpinista("Pedja Stankovic");

        dom.uclaniPlaninara(nemanja);
        dom.uclaniPlaninara(marko);
        dom.uclaniPlaninara(pedja);

        marko.uspesanUspon(jastrebovac);
        nemanja.uspesanUspon(jastrebovac);
        marko.uspesanUspon(jastrebovac);
        pedja.uspesanUspon(jastrebovac);
        nemanja.uspesanUspon(jastrebovac);
        nemanja.uspesanUspon(jastrebovac);

        dom.sortirajPlaninarePoBrojuPoena();
        List<Planinar> listaPlaninara = dom.brUspesnoPopetihPlaninara(jastrebovac);

        dom.removePlaninar(4);
        dom.stampajPodatkeDoma();
        System.out.println("Mesecni prihod: " + dom.mesecniPrihod() + " rsd" + "\n");

    }
}
