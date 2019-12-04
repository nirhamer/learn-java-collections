import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

  /*
  ranges
   */
        int from;
        int to;

  /*
  data count
   */
        int pairsCount;

    /*
  key-value pairs
   */
        Map<Integer, String> pairs = new TreeMap<>();

        Scanner scanner = new Scanner(System.in);

        /*
        expected
        2 4
        3
         */

        from = scanner.nextInt();
        to = scanner.nextInt();
        pairsCount = scanner.nextInt();


        for (int i = 0; i < pairsCount; i++) {
            /*
            expected 1 aa and so on
             */
            pairs.put(scanner.nextInt(), scanner.nextLine().trim());

        }

        for (Integer thisKey : pairs.keySet()) {
            if (thisKey >= from && thisKey <= to) {
                System.out.println(String.format("%d %s", thisKey, pairs.get(thisKey)));
            }
        }
    }
}