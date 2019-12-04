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

        from = scanner.nextInt();
        to = scanner.nextInt();


        pairsCount = scanner.nextInt();

//        System.out.println(String.format("from: %d, to: %d, count: %d",
//                from, to, pairsCount));
//        System.out.println("Please enter pairs:");


        for (int i = 0; i < pairsCount; i++) {
            pairs.put(scanner.nextInt(), scanner.nextLine().trim());

        }


        for (Map.Entry<Integer, String> pair : pairs.entrySet()) {
            Integer thisKey = pair.getKey();
            if (thisKey >= from && thisKey <= to) {
                System.out.println(String.format("%d %s", thisKey, pair.getValue()));
            }
            //ctlrl - alt  - l => rearrange all code
        }
    }
}