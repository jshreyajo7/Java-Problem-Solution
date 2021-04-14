import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArrayReverse {

  // Complete the reverseArray function below.
  static int[] reverseArray(int[] a) {
    int n = a.length;
    int[] b = new int[n]; 
    int j = n; 
    for (int i = 0; i < n; i++) { 
        b[j - 1] = a[i]; 
        j = j - 1; 
    } 

    /*printing the reversed array*/
    System.out.println("Reversed array is: \n"); 
    for (int k = 0; k < n; k++) { 
        System.out.println(b[k]); 
    } 
    return b;
  
  }

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) throws IOException {
    // BufferedWriter bufferedWriter = new BufferedWriter(new
    // FileWriter(System.getenv("OUTPUT_PATH")));

    // System.out.println("Enter array count");
    int arrCount = 4;
    // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    int[] arr = new int[arrCount];

    // System.out.println("Enter array elements");
    String[] arrItems = {"1", "4", "3", "2"};
    // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    for (int i = 0; i < arrCount; i++) {
      int arrItem = Integer.parseInt(arrItems[i]);
      arr[i] = arrItem;
    }

    int[] res = reverseArray(arr);

    // for (int i = 0; i < res.length; i++) {
    // bufferedWriter.write(String.valueOf(res[i]));
    //
    // if (i != res.length - 1) {
    // bufferedWriter.write(" ");
    // }
    // }

    // bufferedWriter.newLine();
    //
    // bufferedWriter.close();

    scanner.close();
  }


}
