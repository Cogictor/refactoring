import java.util.Enumeration;

public abstract class Statement {
   public abstract String getStartResult (Customer aCustomer);

   public abstract String getMiddleResult (Rental each);

   public abstract String getEndResult (Customer aCustomer);

   public String value(Customer aCustomer) {
      Enumeration rentals = aCustomer.getRentals();
      String result = getStartResult(aCustomer);
      while (rentals.hasMoreElements()) {
         Rental each = (Rental) rentals.nextElement();
         //show figures for this rental
         result += getMiddleResult(each);
      }
      //add footer lines
      result += getEndResult(aCustomer);
      return result;
   }
}