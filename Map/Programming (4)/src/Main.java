import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static final Map<Character, Character> encodingTable = new HashMap<>();
    static final Map<Character, Character> decodingTable = new HashMap<>();

    public static String encode(String str) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte[] encod = encoder.encode(str.getBytes());
        return new String(encod);
    }

    public static String decode(String str) {
        Base64.Decoder decoder = Base64.getDecoder();
        byte[] decoded = decoder.decode(str);
        return new String(decoded);
    }

    public static void main(String[] args) {

        fillTable();
        final String input = "abcd";
        System.out.println("Input:  "+input);
        final String encoded = encodingFunction(input);
        final String original = decodingFunction(encoded);
        System.out.println("Encoded:  "+encoded);
        System.out.println("Decoded:  "+original);


    }

    private static String decodingFunction(String input) {
        final int length = input.length();
        char[] out = new char[length];
        for (int i = 0; i < length; i++) {
            out[i] = decodeLetter(input.charAt(i));
        }
        return new String(out);
    }

    private static void fillTable() {
        encodingTable.put('a', '*');
        encodingTable.put('b', 'd');
        encodingTable.put('c', '%');
        encodingTable.put('d', '#');

        for (Map.Entry<Character, Character> pair : encodingTable.entrySet()) {
            decodingTable.put(
                    pair.getValue(),
                    pair.getKey());
        }

    }


    private static String encodingFunction(String input) {
        final int length = input.length();
        char[] out = new char[length];
        for (int i = 0; i < length; i++) {
            out[i] = encodeLetter(input.charAt(i));
        }
        return new String(out);
    }

    private static Character encodeLetter(Character letter) {
        Character ret = encodingTable.get(letter);
        if (ret == null) throw new IllegalArgumentException("No replacement for " + letter);
        return ret;
    }

    private static Character decodeLetter(Character letter) {
        Character ret = decodingTable.get(letter);
        if (ret == null) throw new IllegalArgumentException("No replacement for " + letter);
        return ret;
    }

}