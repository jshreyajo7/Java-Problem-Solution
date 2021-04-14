import java.util.Arrays;
import java.util.Scanner;

public class Mode {

  public enum PaymentMode {
    
    CASH("Cash"), 
    INTERNET_BANKING("InternetBanking"),
    DEBIT_CARD("DebitCard"),
    CREDIT_CARD("CreditCard"),
    PREPAID_CARD("PrepaidCard"),
    IMPS("IMPS"),
    UPI("UPI"),
    WALLET("Wallet"),
    NEFT("NEFT"),
    AADHAAR_ENABLED_PAYMENT_SYSTEM ("AEPS"),
    ACCOUNT_TRANSFER("AccountTransfer"),
    BHARAT_QR("BharatQR"),
    USSD("USSD");
    
    private String paymentMode;

    private PaymentMode(String paymentMode) {
      this.paymentMode = paymentMode;
    }

    public String value() {
      return this.paymentMode;
    }

    public boolean equals(String paymentMode) {
      return this.paymentMode.equalsIgnoreCase(paymentMode);
    }
    
    public static String nameOf(String value) {
      for (PaymentMode paymentMode : values()) {
          if (paymentMode.value().equalsIgnoreCase(value.replaceAll(" ", ""))) {
              return paymentMode.name();
          }
      }
      return null;
  }
  }
  
  public static void main(String[] args) {
    
    
    System.out.println("Enter the input for paymentMode");
    Scanner b = new Scanner(System.in);
   
    String c = b.nextLine();
    String a = Mode.PaymentMode.nameOf(c);
    
    //Enum to String using Currency.valueOf()
    Mode.PaymentMode  pm = Mode.PaymentMode.valueOf(a);

    switch(pm) {
       case CASH:
          System.out.println("You choose cash!");
          break;
       case INTERNET_BANKING:
          System.out.println("You choose INTERNET_BANKING!");
          break;
       case DEBIT_CARD:
          System.out.println("You choose DEBIT_CARD!");
          String r = Arrays.toString(pm.value().split("(?=[A-Z])"));
          String d=r.replace('[' , ' ').replaceAll(",", "").replace(']', ' ');
          System.out.println("Change:"  + d);
          break;
       case CREDIT_CARD:
          System.out.println("You choose IMPS!");
          break;
       case IMPS:
          System.out.println("You choose IMPS!");
          break;
       case ACCOUNT_TRANSFER:
         System.out.println("You choose Account  Transfer!");
         String s = Arrays.toString(pm.value().split("(?=[A-Z])"));
         String f=s.replace('[' , ' ').replaceAll(",", "").replace(']', ' ');
         System.out.println("Change of account transfer:"  +f);
         break;
       default:
          System.out.println("I don't know your mode.");
          break;
    }

  }

}
