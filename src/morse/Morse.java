package morse;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Morse {

    private Map<String, String> morseToDigit;
    public Morse() {
        morseToDigit = new HashMap<>();
        morseToDigit.put("-----", "0");
        morseToDigit.put(".----", "1");
        morseToDigit.put("..---", "2");
        morseToDigit.put("...--", "3");
        morseToDigit.put("....-", "4");
        morseToDigit.put(".....", "5");
        morseToDigit.put("-....", "6");
        morseToDigit.put("--...", "7");
        morseToDigit.put("---..", "8");
        morseToDigit.put("----.", "9");
    }

    public String translateMorseToDigit(String morse) {
        return morseToDigit.get(morse);
    }
}