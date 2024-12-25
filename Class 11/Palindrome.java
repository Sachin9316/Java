public class Palindrome {

  public static void palin(int n) {
    int original = n;
    int rev = 0;

    while (n != 0) {
      int lastDigit = n % 10;
      rev = rev * 10 + lastDigit;
      n = n / 10;
    }

    if (rev == original) {
      System.out.println(original + " is Palindrome");
    } else {
      System.out.println(original + " is Not Palindrome");
    }
  }

  public static void main(String[] args) {
    palin(121);
    palin(123);
  }
}
