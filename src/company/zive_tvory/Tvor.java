package company.zive_tvory;

import java.util.*;

public abstract class Tvor implements dieable, bornable{
    protected Date day_of_birth;
    protected Date day_of_death;
    public abstract void hybsa(int x, int y, int z);

    public Date getDay_of_birth() {
        return day_of_birth;
    }
}
