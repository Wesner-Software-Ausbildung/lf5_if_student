package dateValidation;

public class DateValidator {

    public boolean validateDate(int day, int month, int year) {

        if (day >= 1 && day <= 31) {
            System.out.println(day);

        }

        if (month >= 1 && month <= 12) {
            System.out.println(month);

        }

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year);
        }
        //else
            //System.out.println("Das Datum ist richtig!");
                return false;
    }

}
