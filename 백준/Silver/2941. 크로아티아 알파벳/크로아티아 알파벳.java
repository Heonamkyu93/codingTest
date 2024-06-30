import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    int count = str.length();

    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == '-') {
        count--;
      } else if (str.charAt(i) == '=') {
        count--;
        if (i > 1 && str.charAt(i - 1) == 'z' && str.charAt(i - 2) == 'd') {
          count--;
        }
      } else if (str.charAt(i) == 'j' && i > 0 && (str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n')) {
        count--;
      }
    }
    System.out.println(count);
    sc.close();
  }
}
