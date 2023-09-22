package calculator;

public class Calculator {

    public String calculate(double number1, double number2, char operator) {
        double result;

        if (operator == '+') {
            result = number1 + number2;
        } else if (operator == '-') {
            result = number1 - number2;
        } else if (operator == '*') {
            result = number1 * number2;
            operator = 'x';
        } else if (operator == '/') {
            if (number2 == 0) {
                return "Division durch 0 nicht möglich!";
            }
            result = number1 / number2;
            operator = ':';
        } else {
            return "Sie müssen einen der vier Operatoren +,-,*,/ eingeben!";
        }
        return number1 + " " + operator + " " + number2 + " = " + result;
    }
}

