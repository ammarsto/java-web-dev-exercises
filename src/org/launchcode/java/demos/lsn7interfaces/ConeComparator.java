package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        int result = 0;
        if (o1.getCost()-o2.getCost() > 0) {
            result = 1;
        } else if (o1.getCost() - o2.getCost() == 0) {
            result = 0;
        } else {
            result = -1;
        }
        return result;
    }
}
