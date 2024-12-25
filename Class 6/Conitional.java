import java.util.*;

public class Conitional {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter Your Marks : ");
    int x = scn.nextInt();
    // int x = 61;

    if (x > 90) {
      System.out.println("Excellent");
    } else if (x > 80 && x <= 90) {
      System.out.println("Good");
    } else if (x > 70 && x <= 80) {
      System.out.println("Fair");
    } else if (x > 60 && x <= 70) {
      System.out.println("Meets Expectations");
    } else {
      System.out.println("Below Par");
    }
    ;
  }
}