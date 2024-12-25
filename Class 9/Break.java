
import java.util.Scanner;

public class Break {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    while (true) {
      System.out.print("Enter any number but not multiple of 10 : ");
      int n = sc.nextInt();
      if (n % 10 == 0) {
        continue;
      }
      System.out.println(n);
    }
    // int i = 0;
    // while (i < 5) {
    // if (i == 3) {
    // break;
    // }
    // System.out.println(i);
    // i++;
    // }
    // System.out.println("I am out of loop");
  }
}
