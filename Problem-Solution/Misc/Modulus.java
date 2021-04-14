import java.util.Scanner;

public class Modulus {
  
  public static void fizzBuzz(int n) {
    // Write your code here
        if(n % 3 == 0 && n % 5 == 0){
            System.out.println("FizzBuzz");
        }else if(n % 3 == 0){
             System.out.println("Fizz");
        }else if(n % 5 == 0){
             System.out.println("Buzz");
        }else{
            System.out.println(n);
        }
    }


  public static void main(String[] args) {
    
    System.out.println("Enter the input");
    Scanner t = new Scanner(System.in);
    int n = t.nextInt();
    
    Modulus.fizzBuzz(n);
    
    String s ="abc";
    s.replaceAll("abc", "xyz");
    System.out.println(s);
    System.out.println(s.replaceAll("abc", "xyz"));

  }
}
