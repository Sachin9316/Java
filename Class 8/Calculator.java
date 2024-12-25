
import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the first number:");
    int a = sc.nextInt();
    System.out.print("Enter the second number:");
    int b = sc.nextInt();

    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");
    int num = sc.nextInt();
    switch (num) {
      case 1:
        System.out.println("Addition of a and b is : " + (a + b));
        break;
      case 2:
        System.out.println("Subtraction of a and b is : " + (a - b));
        break;
      case 3:
        System.out.println("Multiplication of a and b is : " + (a * b));
        break;
      case 4:
        System.out.println("Division of a and b is : " + (a / b));
        break;
      default:
        System.out.println("Select only between 1 to 4 number");
    }
  }
}
