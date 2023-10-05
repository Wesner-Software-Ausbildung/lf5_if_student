package dateValidation;

public class DateValidator {

    public boolean validateDate(int day, int month, int year) {

        switch (day) {
            case 1:
                if (day >= 1 && day <= 31) {
                    break;
                } else if (day >= 0 && day <= 32) {
                    System.out.println("Das Datum ist ungültig!!");
                    break;
                }

            case 2:

                if (month >= 1 && month <= 12) {
                    break;
                } else if (month >= 0 && month <= 13) {
                    System.out.println("Das Datum ist ungültig!");
                    break;
                }


            case 3:
                if (year >= 1 && year <= 40000) {
                    System.out.println("Das Datum ist richtig!!");
                    break;
                } else if (year >= 0 && year <= 40001) {
                    System.out.println("Das Datum ist ungültig!");
                    break;
                }

                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("Dieses Jahr ist ein Schaltjahr!");
                    break;

                }


                //else
                //System.out.println("Das Datum ist richtig!");

                return false;
        }

        return false;

    }
}
