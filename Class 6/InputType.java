import java.util.*;

public class InputType {
  public static void main(String[] args) {
    float pi = 3.14f;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Radius : ");
    float radius = scan.nextFloat();
    float area = pi * (radius * radius);
    System.out.println(area);
  }
}
