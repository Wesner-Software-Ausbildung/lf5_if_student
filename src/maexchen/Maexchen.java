package maexchen;

public class Maexchen {

    public int calculatePoints(int throw1, int throw2) {

        if (throw1 < 1 || throw1 > 6 || throw2 < 1 || throw2 > 6) {
            return -1;
        }

            if (throw1 == 1 && throw2 == 2 || throw1 == 2 && throw2 == 1) {
                System.out.println("Du hast gewonnen!");
                return 1000;

            } else if (throw1 == throw2) {
                System.out.println("Nicht so schlecht!");
                return throw1 * 100;
            } else if (throw1 > throw2) {
                return throw1 * 10 + throw2;
            } else {
                return throw2 * 10 + throw1;
            }
        }

    }


