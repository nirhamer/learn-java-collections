import java.util.Scanner;
import java.util.Stack;

public class Main {

  public static void main(String[] args) {
    Stack<Character> stack = new Stack<>();
    Scanner scanner = new Scanner(System.in);
    String s = scanner.nextLine();

    for(int i=0; i<s.length(); i++){
      if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i)=='('){
        stack.push(s.charAt(i));
      }else if(!stack.empty() && ((s.charAt(i) == ']' && stack.peek() == '[') ||
              (s.charAt(i) == '}' && stack.peek() == '{') ||
              (s.charAt(i) == ')' && stack.peek() == '('))){
        stack.pop();
      }else{
        stack.push(s.charAt(i));
      }
    }
    if (stack.empty()){
      System.out.println("true");
    }else {
      System.out.println("false");
    }
  }
}