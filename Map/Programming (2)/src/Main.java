import java.util.HashMap;
        import java.util.Map;
        import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    String[] words = line.split(" ");
    Map<String,Integer> wordCount = new HashMap<>();
    for (String aWord:words) {
      String word = aWord.toLowerCase();
      if (wordCount.containsKey(word)){
        int newCount = wordCount.get(word) + 1;
        wordCount.replace(word,newCount);
      }
      else {
        wordCount.put(word,1);
      }
    }
    for (Map.Entry<String,Integer> m: wordCount.entrySet()) {
      System.out.println(m.getKey()+" "+m.getValue());
    }
  }
}