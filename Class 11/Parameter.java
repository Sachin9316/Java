public class Parameter {

  public static int sum(int a, int b) {
    return a + b;
  }

  public static void swap(int a, int b) {
    // Swap
    int temp = a;
    a = b;
    b = temp;

    System.out.println("value of a is = " + a + " " + "value of b after is = " + b);
  }

  public static int multi(int a, int b) {
    return a * b;
  }
  public static int factorial(int n) {
    int f = 1;
    for(int i = 1;i <= n;i++) {
      f = f*i;
    }  

    return f;
  }

  public static void main(String[] args) {
    int a = 5;
    int b = 10;
    swap(a, b);
    System.out.println(multi(a, b));
    System.out.println(factorial(7));
  }
}
