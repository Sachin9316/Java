public class OverLoading {

  public static int sum(int a, int b, int c) {
    return a + b + c;
  }

  public static float sum(float a, float b) {
    return a + b;
  }

  public static double sum(double a, double b, double c) {
    return a + b + c;
  }

  public static void main(String[] args) {
    System.out.println(sum(1, 2, 3));
    System.out.println(sum(1.4f,4.7f));
    System.out.println(sum(1.5, 2.5, 3.5));
  }
}
