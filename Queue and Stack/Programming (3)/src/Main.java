import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Deque<Integer> input = new ArrayDeque<>();
    Scanner scanner = new Scanner(System.in);
    int count = scanner.nextInt();

    for (int i = 0; i < count; i++) {
      int nextInt = scanner.nextInt();
      if (nextInt % 2 == 0) {
        input.push(nextInt);
      } else input.addLast(nextInt);
    }

    for (int i : input) {
      System.out.println(i);
    }
  }
}