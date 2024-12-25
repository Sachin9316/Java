public class Computenumber {
  public static int compute(int num) {
    int sum = 0;

    while(num > 0) {
      int lastDigit = num % 10; // get last number
      sum += lastDigit; // store and add lastdigit to sum
      num /= 10; // remove the last number
    }

    return sum;
  }
  public static void main(String[] args) {
    System.out.println(compute(123456789));
  }
}
