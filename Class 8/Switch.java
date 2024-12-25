public class Switch {
  public static void main(String[] args) {
    int num = 1;
    switch (num) {
      case 1:
        System.out.println("samosa");
        break;
      case 2:
        System.out.println("Burger");
        break;
      case 3:
        System.out.println("Pizza");
        return;
      default:
        System.out.println("Dreaming");
    }
  }
}
