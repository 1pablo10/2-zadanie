package company.zive_tvory.Ryby;

import company.zive_tvory.Stavovec;

import java.util.*;

public abstract class Ryba extends Stavovec {
    private String meno;
    private int vek;
    private int rychlost;
    @Override
    public void hybsa(int x, int y, int z) {
        System.out.println("Plavem");
    }

    public String getMeno() {
        return meno;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public int getRychlost() {
        return rychlost;
    }

    public void setRychlost(int rychlost) {
        this.rychlost = rychlost;
    }

    public Ryba(int pocet_stavcov) {
        super(pocet_stavcov);
    }

    public void zrychli(int zrychlenie){
        this.rychlost += zrychlenie;
    }

    @Override
    public void born(Date day_of_birth) {
        System.out.println("Narodil som sa: " + day_of_birth.toString());
        super.day_of_birth = day_of_birth;
    }

    @Override
    public void die(Date day_of_death) {
        System.out.println("Zomrel som: " + day_of_death.toString());
        super.day_of_death = day_of_death;
    }
}
