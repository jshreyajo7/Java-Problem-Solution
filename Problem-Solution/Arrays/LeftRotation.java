import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeftRotation {

  static int gcd(int a, int b) {
    if (b == 0)
      return a;
    else
      return gcd(b, a % b);
  }

  // Complete the rotLeft function below.
  static int[] rotLeft(int[] arr, int d) {
    /* To handle if d >= n */
    int n = arr.length;
    d = d % n;
    int i, j, k, temp;
    int g_c_d = gcd(d, n);
    for (i = 0; i < g_c_d; i++) {
      /* move i-th values of blocks */
      temp = arr[i];
      j = i;
      while (true) {
        k = j + d;
        if (k >= n)
          k = k - n;
        if (k == i)
          break;
        arr[j] = arr[k];
        j = k;
      }
      arr[j] = temp;
    }

    return arr;
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    
    int arrCount = 5;
    // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
    
    int d= 4;

    int[] arr = new int[arrCount];

    // System.out.println("Enter array elements");
    String[] arrItems = {"1","2","3","4","5"};
    // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < arrCount; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    int[] res = rotLeft(arr, d);
    
    for (int i = 0; i < arrCount; i++) {
      System.out.println(arr[i]);
    }
    

    scanner.close();
  }
}


