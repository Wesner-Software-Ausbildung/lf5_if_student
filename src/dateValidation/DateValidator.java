package dateValidation;

public class DateValidator {

    public boolean validateDate(int day, int month, int year) {

        //boolean isTrue = false;

                if (day >= 1 && day <= 31) {

                } //else if (day >= 0 && day <= 32) {
                   // System.out.println("Das Datum ist ungültig!!");
  //  }
                else {
                    System.out.println("Das Datum ist ungültig!!");
                }



                if (month >= 1 && month <= 12) {

                }
                else {
                    System.out.println("Das Datum ist ungültig!!");
                }
                /*else if (month >= 0 && month <= 13) {
                    System.out.println("Das Datum ist ungültig!");

                }*/



                if (year >= 1 && year <= 40000) {
                    System.out.println("Das Datum ist richtig!!");

                }
                else {
                    System.out.println("Das Datum ist ungültig!!");
                }

                /*else if (year >= 0 && year <= 40001) {
                    System.out.println("Das Datum ist ungültig!");

                } */

                if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {


                    //System.out.println("Dieses Jahr ist ein Schaltjahr!");


                }


                //else
                //System.out.println("Das Datum ist richtig!");

                return false;
        }



    }

