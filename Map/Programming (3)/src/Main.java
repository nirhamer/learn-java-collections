import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Set<String> dict = new LinkedHashSet<>();
    Set<String> text = new LinkedHashSet<>();
    Map<String, Integer> result = new LinkedHashMap<>();

    int cStrings = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < cStrings; i++) {
      dict.add(sc.nextLine().toLowerCase(Locale.getDefault()).trim());
    }

    int cLine = sc.nextInt();
    sc.nextLine();
    for (int i = 0; i < cLine; i++) {
      text.addAll(Arrays.asList(sc.nextLine().toLowerCase(Locale.getDefault()).trim().split("\\s")));
    }





    for (String s : text) {
      if (!dict.contains(s) && !s.equals("")) { result.put(s, result.getOrDefault(s, 0) + 1);}
    }

    for (Map.Entry<String, Integer> set : result.entrySet()) { System.out.println(set.getKey()); }
  }}