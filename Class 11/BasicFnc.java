public class BasicFnc {
  public static void hello(int x) {
    for (int i = 1; i <= x; i++) {
      System.out.println("Hello World");
    }
  }

  public static void main(String[] args) {
    hello(5);
  }
}