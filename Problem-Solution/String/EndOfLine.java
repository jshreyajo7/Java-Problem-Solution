  import java.io.*;
  import java.util.*;

  public class EndOfLine {
    
    public static String getCamelCase(String input) {
    String result = "";
    char firstChar = input.charAt(0);
    result = result + Character.toLowerCase(firstChar);
    for (int i = 1; i < input.length(); i++) {
      char currentChar = input.charAt(i);
      char previousChar = input.charAt(i - 1);
      if (previousChar == ' ' /*
                               * || Character.isUpperCase(previousChar) ||
                               * Character.isUpperCase(currentChar)
                               */) {
        result = result + Character.toLowerCase(currentChar);
      } else {
        result = result + currentChar;
      }
    }
    return result;
  }

      public static void main(String[] args) {
         
   Scanner scan = new Scanner(System.in);
   String t=scan.next();
   for(int i = 1; scan.hasNext()== true; i++){
     String result = "SUCCCESS";
      System.out.println(result);
       System.out.println(i + " " + scan.nextLine());
   }
  }
  }


