package morse;

import java.util.Scanner;
public class MorseUI {

        public static void main(String[] args) {
            Morse morse = new Morse();
            Scanner scanner = new Scanner(System.in);

            System.out.print("Geben Sie die Morsezeichen ein: ");
            String input = scanner.nextLine();

            String[] morseChars = input.split(" ");
            StringBuilder result = new StringBuilder();

            for (String morseChar : morseChars) {
                String digit = morse.translateMorseToDigit(morseChar);
                result.append(digit);
            }

            System.out.println("Übersetzung: " + result.toString());
        }
    }

