package maexchen;
import java.util.Random;

public class MaexchenUI {

    public static void main(String[] args) {

        Maexchen maexchen = new Maexchen();
        Random random = new Random();
        int throw1 = random.nextInt(6) + 1;
        int throw2 = random.nextInt(6) + 1;

        System.out.println("Erster Wurf: " + throw1);
        System.out.println("Zweiter Wurf: " + throw2);

        System.out.println("Punktzahl: " + maexchen.calculatePoints(throw1, throw2));
    }
}
