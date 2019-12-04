import jdk.internal.net.http.common.Pair;

public class Main {

  public static void main(String[] args) {

    Object b;
    Pair p1 = new Pair(2,b);
    Object c;
    Pair p2 = new Pair(3,c);
    Object d;
    Pair p3 = new Pair(4,d);
    System.out.println(p1.equals(p2) + “ ” + p2.equals(p3);

  }
}