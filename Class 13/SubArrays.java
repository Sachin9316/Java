public class SubArrays {
  public static void subArray(int num[]) {
    int total = 0;
    int sum = 0;
    for (int i = 0; i < num.length; i++) {
      int start = i;
      for (int j = 0; j < num.length; j++) {
        int end = j;
        for (int k = start; k <= end; k++) {
          System.out.print("(" + num[k] + ")");
          System.out.print("Total sub Array : " + sum + num[k]);
        }
        total++;
        System.out.print(" ");
      }
      System.out.println();
    }
    System.out.println("Total sub arrays : " + total);
  }

  public static void main(String[] args) {
    int num[] = { 2, 4, 6, 8, 10 };
    subArray(num);
  }
}
