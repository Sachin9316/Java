import java.util.Scanner;

public class TypeCasting {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    // int gst = 18 / 100;
    int average = (a + b + c) * 18 / (100);
    System.out.println("The bill of three numbers is: " + average);
  }
}
