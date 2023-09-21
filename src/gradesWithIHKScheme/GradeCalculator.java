package gradesWithIHKScheme;

import java.util.Scanner;

public class GradeCalculator {
    public int calculateGrade(double points, int reachablePoints) {
        double c = Math.round((points / reachablePoints) * 100);
        int d;

        if (c >= 92) {
            d = 1;
        } else if (c >= 81) {
            d = 2;
        } else if (c >= 67) {
            d = 3;
        } else if (c >= 50) {
            d = 4;
        } else if (c >= 30) {
            d = 5;
        } else d = 6;

        if (c > reachablePoints)
            d = -1;

        return d;
    }
}