
public class BinoCoefficient {

  public static int factorial(int n) {
    int f = 1;
    for (int i = 0; i <= n; i++) {
      f *= i;
    }
    return f;
  }

  public static int binoCoeffi(int n, int r) {
    int n_facto = factorial(n);
    int r_facto = factorial(r);
    int nr_fato = factorial(n - r);
    int bc = nr_fato / (r_facto * n_facto); 
    return bc;
  }

  public static void main(String[] args) {
    // System.out.print("Enter value of n : ");
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // System.out.print("Enter value of r : ");
    // int r = sc.nextInt();

    System.out.println(binoCoeffi(5, 2));
  }
}
