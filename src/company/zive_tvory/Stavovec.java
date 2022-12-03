package company.zive_tvory;

import company.zive_tvory.stavovce_diely.Chrbtica;
import company.zive_tvory.stavovce_diely.Sustava;
import company.zive_tvory.stavovce_diely.Typ_sustavy;

public abstract class Stavovec extends Tvor {
    protected Chrbtica chrbtica;
    protected Sustava[] sustava;

    public Stavovec(int pocet_stavcov) {
        chrbtica = new Chrbtica(pocet_stavcov);
        create_sustavy();
    }

    private void create_sustavy() {
        sustava = new Sustava[8];

        sustava[0] = new Sustava(Typ_sustavy.OBEHOVA);
        sustava[1] = new Sustava(Typ_sustavy.OPORNA);
        sustava[2] = new Sustava(Typ_sustavy.VYLUCOVACIA);
        sustava[3] = new Sustava(Typ_sustavy.POHYBOVA);
        sustava[4] = new Sustava(Typ_sustavy.DYCHACIA);
        sustava[5] = new Sustava(Typ_sustavy.TRAVIACA);
        sustava[6] = new Sustava(Typ_sustavy.ROZMNOZOVACIA);
        sustava[7] = new Sustava(Typ_sustavy.NERVOVA);
    }

    public Sustava[] getSustavy() {
        return sustava;
    }
}
