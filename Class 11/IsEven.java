public class IsEven {

  public static boolean isEven(int a) {
    if (a % 2 == 0) {
      return true;
    }
    return false;
  }

  public static void checkEvenOrOdd(int n) {
    if (isEven(n)) {
      System.out.println("Even No : " + n);
    } else {
      System.out.println("Odd No : " + n);
    }
  }

  public static void main(String[] args) {
    checkEvenOrOdd(12);
  }
}
