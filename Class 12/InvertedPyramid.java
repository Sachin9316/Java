public class InvertedPyramid {

  public static void inverted_Pyramid(int row) {

    for (int i = 1; i <= row; i++) {
      for (int j = 1; j <= row - i; j++) {
        System.out.print(j);
      }

      for (int j = 1; j <= i; j++) {
        System.out.print(" ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    inverted_Pyramid(6);
  }
}
