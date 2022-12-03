package company.vesminetelesa;

import company.zive_tvory.*;

public class Zem extends Planeta{
    private Tvor[] poleTvorov;
    private int pocet_tvorov;
    public Zem(String name, double weight, double diameter) {
        super(name, weight, diameter);
        poleTvorov = new Tvor[1000];
        int pocet_tvorov = 0;
    }
    public void addTvor(Tvor tvor) {
        poleTvorov[pocet_tvorov] = tvor;
        pocet_tvorov++;
    }

    public Tvor[] getPoleTvorov() {
        return poleTvorov;
    }
}
