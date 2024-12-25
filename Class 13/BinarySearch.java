public class BinarySearch {

  public static int b_Search(int num[], int key) {
    int start = 0;
    int end = num.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (num[mid] == key) {
        return mid;
      }

      if (num[mid] < key) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }

    return -1;
  }

  public static void main(String[] args) {
    int num[] = { 2, 4, 6, 7, 8, 9, 10, 13, 14, 15, 16, 17, 18 };
    int key = 4;
    int index = b_Search(num, key);

    System.out.println("index for key is : " + index);
  }
}
