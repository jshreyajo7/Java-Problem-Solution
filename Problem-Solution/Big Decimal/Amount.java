import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Amount {
	
	
	private static BigDecimal truncateDecimal(double x, int numberofDecimals)
		{
	    if ( x > 0) {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals, RoundingMode.FLOOR);
	    } else {
	        return new BigDecimal(String.valueOf(x)).setScale(numberofDecimals,  RoundingMode.CEILING);
	    }
	}

	public static void main(String[] args) {
		
		System.out.println("Enter the input for conversion");
		Scanner b = new Scanner(System.in);
		String currency=b.next();
		BigDecimal bigDecimalCurrency=new BigDecimal(currency); 
		System. out. println("Converted String currency to bigDecimalCurrency: "+bigDecimalCurrency);
		
		System. out. println("Converting Paise to Rupee");
		
		BigDecimal hundred = new BigDecimal(100.00);
		
		Double ruppeeBigDecimalCurrency= bigDecimalCurrency.divide(hundred).doubleValue();
		
		System. out. println("Paise to Rupee conversion:  "+ruppeeBigDecimalCurrency);
		
		BigDecimal ruppeeBigDecimalCurrencDoubleDecimal= truncateDecimal(ruppeeBigDecimalCurrency, 2);
		
		String ruppeeBigDecimalCurrencDoubleDecimalString= ruppeeBigDecimalCurrencDoubleDecimal.toString();
		
		System. out. println("Double digit conversion:  "+ruppeeBigDecimalCurrencDoubleDecimal);
		
		System. out. println("Double digit conversion-String :  "+ruppeeBigDecimalCurrencDoubleDecimalString);
		
		
		System. out. println("Converting Rupee to Paise");
		
		Long paisaBigDecimalCurrency=new BigDecimal(ruppeeBigDecimalCurrencDoubleDecimalString).multiply(hundred).longValue();
		
		System. out. println("Rupee to Paise conversion:  "+paisaBigDecimalCurrency);
		System. out. println("String Coversion: "+paisaBigDecimalCurrency.toString());
		
		
		

	}
	

}
