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

        Scanner scanner = new Scanner(System.in);

        String sample;
        String encoded;
        String toEncode;
        String toDecode;


        sample = scanner.nextLine().trim();
        encoded = scanner.nextLine().trim();
        toEncode = scanner.nextLine().trim();
        toDecode = scanner.nextLine().trim();


//        sample = "abcd";
//        encoded = "*d%#";

        calculateKeys(sample, encoded);

        final String decodedSample = decodeString(encoded);
//        System.out.println("Input:  "+sample);
//        System.out.println("Decoded:  "+decodedSample);


        System.out.println( encodeString(toEncode));
        System.out.println( decodeString(toDecode));

    }

    /**
     * This will fill in encryption and decryption tables
     * @param sample a sample string
     * @param encoded it's encoded version
     */
    private static void calculateKeys(String sample, String encoded) {
        for (int i = 0; i < sample.length(); i++) {
            encodingTable.put(sample.charAt(i), encoded.charAt(i));
            decodingTable.put(encoded.charAt(i),sample.charAt(i));
        }
    }

    private static String decodeString(String input) {
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


    private static String encodeString(String input) {
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