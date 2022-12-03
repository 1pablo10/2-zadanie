package company.zive_tvory;

import java.util.Date;

public class Cicavec extends Tvor{
    private String meno;
    private int vek;
    private int vyska;
    @Override
    public void hybsa(int x, int y, int z) {
        System.out.println("Cicavcujem");
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

    public int getVyska() {
        return vyska;
    }

    public void setVyska(int vyska) {
        this.vyska = vyska;
    }

    public Cicavec(String meno, int vek) {
        this.meno = meno;
        this.vek = vek;
        this.vyska = 0;
    }

    public void skok(int vyska){
        this.vyska += vyska;
        System.out.println("Skocil som");
        dopadni();

    }
    public void dopadni(){
        System.out.println("Dopadol som");
        setVyska(0);
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
