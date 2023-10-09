package dateValidation;

public class DateValidator {

    public boolean validateDate(int day, int month, int year) {

                if (day < 1 || day > 31 || month < 1 || month > 12 || year < 0) {
                    System.out.println("Das Datum ist ungültig!!");
                    return false;
                }
                if (month == 2) {
                    if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
                    if (day > 29) {
                        System.out.println("Das Datum ist ungültig!!");
                        return false;
                    }
                    } else {
                    if (day > 28) {
                        System.out.println("Das Datum ist ungültig!!");
                        return false;
                }
            }
        }

                    if (month == 4 || month == 6 || month == 9 || month == 11) {
                        if (day > 30) {
                            System.out.println("Das Datum ist ungültig!!");
                            return false;
                    }
                }
                         System.out.println("Das Datum ist richtig!!");
                            return true;
        }
}




