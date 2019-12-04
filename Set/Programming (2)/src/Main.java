import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {


    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String word;
      int size = sc.nextInt();
      Set<String> nameSet = new TreeSet<>();
      for (int i = 0; i < size; i++) {
        word = sc.next();
        nameSet.add(word);
      }
      for (String s : nameSet) {
        System.out.println(s);
      }

    }
  }
