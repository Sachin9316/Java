public class FlyodTri {
  public static void Tri(int a) {
    int num = 1;
    for (int i = 1; i <= a; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(num + " ");
        num++;
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    Tri(4);
  }
}
