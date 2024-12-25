import java.util.*;

public class IncomeTax {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your income: ");
    int income = scanner.nextInt();
    int tax;
    if (income < 500000) {
      System.out.println("Your tax is 0");
    } else if (income >= 500000 && income <= 1000000) {
      tax = (int) (income * 0.2);
      System.out.println("Your income after 20% tax is : " + (income - tax));
    } else {
      tax = (int) (income * 0.3);
      System.out.println("Your income after 30% tax is  : " + (income - tax));
    }
  }
}
