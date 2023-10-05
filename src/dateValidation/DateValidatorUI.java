package dateValidation;

import java.util.Scanner;

public class DateValidatorUI {

    public static void main(String[] args) {
        DateValidator dateValidator = new DateValidator();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tag: ");
        int day = scanner.nextInt();
        System.out.print("Monat: ");
        int month = scanner.nextInt();
        System.out.print("Jahr: ");
        int year = scanner.nextInt();
        System.out.println(dateValidator.validateDate(day, month, year));
    }
}
