import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    while(scan.hasNextInt()){list.add(scan.nextInt());}
    System.out.println();
    for (int i=list.size()-1; i >=0; i--) {
      if (i%2!=0){
        System.out.print(list.get(i)+" "); }
    }
  }
}