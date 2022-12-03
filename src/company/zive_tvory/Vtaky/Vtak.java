package company.zive_tvory.Vtaky;

import company.zive_tvory.Stavovec;

import java.util.Date;

public abstract class Vtak extends Stavovec {
    private String meno;
    private int vek;
    private int vyska;
    @Override
    public void hybsa(int x, int y, int z){
        System.out.println("Lietam");
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

    public void setVyska(int vyska){
        this.vyska = vyska;
    }
    public int getVyska() {
        return vyska;
    }

    public Vtak(int pocet_stavcov){
        super(pocet_stavcov);
    }

    public void chojNaVysku(int metre){
        setVyska(metre);
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
