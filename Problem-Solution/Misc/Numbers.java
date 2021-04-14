import java.math.BigDecimal;
import java.util.Scanner;

public class Numbers {

public static void main(String[] args) {
		
		System.out.println("Enter the input for comparison");
		Scanner b = new Scanner(System.in);
		String currency=b.next();
		BigDecimal bigDecimalCurrency= new BigDecimal(currency); 
		
//		if(BigDecimal.ZERO.compareTo(bigDecimalCurrency) > 1) {
//			System.out.println("Number1 is greater than 1");
//			
//		}
//		
//		if(BigDecimal.ZERO.compareTo(bigDecimalCurrency) < 1) {
//			System.out.println("Number1 is less than 1");
//			
//		}
//		
//		if(BigDecimal.ZERO.compareTo(bigDecimalCurrency) == 1) {
//			System.out.println("Number1 is equal than 1");
//			
//		}
//		
//		if(BigDecimal.ZERO.compareTo(bigDecimalCurrency) != 1) {
//			System.out.println("Number1 is not equal than 1");
//			
//		}
//		
//		
//		if(BigDecimal.ONE.compareTo(bigDecimalCurrency) > 1) {
//          System.out.println("Number1 is greater than 1");
//          
//      }
      
      if(BigDecimal.ONE.compareTo(bigDecimalCurrency) < 0) {
          System.out.println(" Zero -Number1 is less than 1");
          
      }
      
      if(BigDecimal.ONE.compareTo(bigDecimalCurrency) == 0) {
          System.out.println("Zero -Number1 is equal than 1");
          
      }
      
      if(BigDecimal.ONE.compareTo(bigDecimalCurrency) != 0) {
          System.out.println("Zero -Number1 is not equal than 1");
          
      }
      
      if(BigDecimal.ONE.compareTo(bigDecimalCurrency) > 0) {
        System.out.println(" Zero -Number1 is greater than 1");
        
    }
		
	
//		if(bigDecimalCurrency.compareTo(BigDecimal.ZERO) > 1) {
//			System.out.println("Number2 is greater than 1");
//			
//		}
//		
//		if(bigDecimalCurrency.compareTo(BigDecimal.ZERO) < 1) {
//			System.out.println("Number2 is less than 1");
//			
//		}
//		
//		if(bigDecimalCurrency.compareTo(BigDecimal.ZERO) == 1) {
//			System.out.println("Number2 is equal than 1");
//			
//		}
//		
//		if(bigDecimalCurrency.compareTo(BigDecimal.ZERO) != 1) {
//			System.out.println("Number2 is not equal than 1");
//			
//		}
		
		
//		System.out.println("Enter the input for comparison");
//        Scanner t = new Scanner(System.in);
//		int n = t.nextInt();
		
//		if(10==n) {
//		  System.out.println("yes");
//		}else {
//		  System.out.println("no");
//		}
		

	}
	
}
