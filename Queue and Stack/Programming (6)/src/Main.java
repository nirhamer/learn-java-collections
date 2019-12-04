import java.util.*;


public class Main {


  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    scanner.nextLine();
    Deque<Integer> q = new ArrayDeque<>();
    Deque<Integer> w = new ArrayDeque<>();
    int count = Integer.MIN_VALUE;

    for( int i = 0; i < n; i++) {
      String[] str = scanner.nextLine().trim().split("\\s");
      if (str[0].equals("push")) {
        int v = Integer.parseInt(str[1]);
        q.push(v);
        if (v > count) {
          w.push(v);
          count = v;
        } else {
          w.push(count);
        }
      } else if (str[0].equals("pop")) {
        q.pop();
        w.pop();
        count = w.peek();
      } else if (str[0].equals("max")){
        System.out.println(w.peek());
      }
    }
  }
}