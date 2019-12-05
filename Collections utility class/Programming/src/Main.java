import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String inputLine = scanner.nextLine().replace(" ", "");
    ArrayList<Character> outputList = new ArrayList<>();
    for (int i = 0; i < inputLine.length(); i++) {
      outputList.add(inputLine.charAt(i));
    }
    int swapCount = scanner.nextInt();

    for (int i = 0; i < swapCount; i++) {
      int index1 = scanner.nextInt();
      int index2 = scanner.nextInt();
      Collections.swap(outputList, index1, index2);
    }

    for (char i: outputList) {
      System.out.print(i + " ");
      List<?> index1 = null;
      int index2 = 0;
      //TODO: fix the code
      //Collections.swap(index1,index2,);
      System.out.println("After swap: "+index2);
    }
  }
}