package company;

import company.space.hmlovina;
import company.space.vesmir;
import company.vesminetelesa.*;
import company.zive_tvory.*;
import company.zive_tvory.Vtaky.*;
import company.zive_tvory.Ryby.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        vesmir mojprvyvesmir = new vesmir();
        mojprvyvesmir.startVesmir();
        hmlovina MiroSmajda = new hmlovina();
        hmlovina PetoCmorik = new hmlovina();
        hmlovina KatkaKnechtova = new hmlovina();
        Planeta X = new Planeta("X",5972200,12756);
        X.setPlanetaryWeight(-2000000);
        Hviezda Slnko = new Hviezda("Slnko",696340,4603);
        Slnecna_sustava Solar = new Slnecna_sustava();
        Solar.addTeleso(X);

        Galaxia Mliecna_Cesta = new Galaxia();
        Mliecna_Cesta.addSustava(Solar);
        Vesmirne_telesa Cierna_diera = new Vesmirne_telesa();

        Mliecna_Cesta.addTeleso(Cierna_diera);
        System.out.printf("Typ telesa: %s",Cierna_diera.getType());

        Galaxia Hudak = new Galaxia();
        Zem MatickaZem = new Zem("Zem", 59722 * Math.pow(10, 24), 12756);
        for(int i=0; i<100;i++){
            MatickaZem.addTvor(new Cicavec("PandaPandaPanda",10));
        }

        Tvor[] pole = MatickaZem.getPoleTvorov();

        for(int i=0;i<100;i++){
            pole[i].hybsa(10,1,10);
        }
        Kapor vianocnyKaper = new Kapor(50);
        Date dNow = new Date();
        vianocnyKaper.born(dNow);

        System.out.println("Vianocny kapor sa narodil " + vianocnyKaper.getDay_of_birth());
        for (int i = 0; i < vianocnyKaper.getSustavy().length; i++) {
            System.out.println(vianocnyKaper.getSustavy()[i].getTypSustavy());
        }
        Zralek zralek = new Zralek(15);
        MatickaZem.addTvor(zralek);

        Orol orel = new Orol(10);
        MatickaZem.addTvor(orel);

        Mucha vinnamuska = new Mucha();
        MatickaZem.addTvor(vinnamuska);
    }
}