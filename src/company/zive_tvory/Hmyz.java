package company.zive_tvory;

import java.util.Date;

public abstract class Hmyz extends Bezstavovce {

    @Override
    public void hybsa(int direction_x, int direction_y, int direction_z) {

        System.out.println("Pohol som sa");
    }

    @Override
    public void born(Date day_of_birth) {

        System.out.println("Narodil som sa: " + super.day_of_birth.toString());

    }

    @Override
    public void die(Date day_of_die) {

        System.out.println("Zomrel som: " + super.day_of_birth.toString());

    }

}
