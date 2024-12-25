
import java.util.Scanner;

public class Prime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to Check Prime number or not : ");
    int n = sc.nextInt();
    boolean isPrime = true;
    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n % i == 0) {
        isPrime = false;
      }
    }

    if (isPrime == true) {
      System.out.println("Prime Number");
    } else {
      System.out.println("Not Prime number");
    }
  }
}
