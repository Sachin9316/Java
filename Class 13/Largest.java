
public class Largest {
  public static int getlargest(int num[]) {
    int largest = Integer.MIN_VALUE;

    for (int i = 0; i < num.length; i++) {
      if (num[i] > largest) {
        largest = num[i];
      }
    }

    return largest;
  }

  public static int getSmallest(int num[]) {
    int smallest = Integer.MAX_VALUE;

    for (int i = 0; i < num.length; i++) {
      if (num[i] < smallest) {
        smallest = num[i];
      }
    }
    return smallest;
  }

  public static void main(String[] args) {
    int num[] = { 1, 2, 6, 4, 5, 3, 8 };

    System.out.println("Larget number in an array : " + getlargest(num));
    System.out.println("Smallest number in an array : " + getSmallest(num));
  }
}
