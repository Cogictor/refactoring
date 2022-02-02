public class TextStatement extends Statement {

   public String getStartResult (Customer aCustomer){
      return "Rental Record for " + aCustomer.getName() +
      "\n";
   }

   public String getMiddleResult (Rental each){
      return "\t" + each.getMovie().getTitle()+ "\t" +
         String.valueOf(each.getCharge()) + "\n";
   }

   public String getEndResult (Customer aCustomer){
      return "Amount owed is " +
      String.valueOf(aCustomer.getTotalCharge()) + "\n" +
      "You earned " +
      String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
      " frequent renter points";
   }

}