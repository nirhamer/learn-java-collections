import java.io.File;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    ArrayDeque<Integer> task1 = new ArrayDeque<>();
    ArrayDeque<Integer> task2 = new ArrayDeque<>();
    Scanner scanner = new Scanner(System.in);
    int jobCount = scanner.nextInt();
    int j1Load = 0, j2Load=0;
    for (int x=0; x<jobCount; x++){
      int jobNum = scanner.nextInt();
      int jobWork = scanner.nextInt();
      if(j1Load <= j2Load) {
        task1.push(jobNum);
        j1Load += jobWork;
      }
      else {
        task2.push(jobNum);
        j2Load += jobWork;
      }
      //System.out.println(x+1);
    }
    StringBuilder J1 = new StringBuilder();
    StringBuilder J2 = new StringBuilder();
    Iterator<Integer> t1IT = task1.descendingIterator();
    Iterator<Integer> t2IT = task2.descendingIterator();

    while(t1IT.hasNext()){
      J1.append(t1IT.next()+" ");
    }
    while(t2IT.hasNext()){
      J2.append(t2IT.next()+" ");
    }
    System.out.println(J1.toString());
    System.out.println(J2.toString());
  }
}