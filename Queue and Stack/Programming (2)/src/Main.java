import java.util.*;

public class Main {
  public static void main(String[] args) {

    Deque<Integer> queue = new ArrayDeque<>();
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    for (int i = 0; i < size; i++) {
      queue.add(sc.nextInt());
    }
    Iterator<Integer> integerIterator = queue.descendingIterator();
    while (integerIterator.hasNext()) {
      System.out.println(integerIterator.next());
    }
  }
}