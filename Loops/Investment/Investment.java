public class Investment {
   public static void main(String[] args) {
      double investment = 2500;
      double interest = 0.075;
      int years = 0;
      
      while (investment <= 5000) {
         double temp = investment * interest;
         investment += temp;
         years++;
      }
      
      System.out.println("After " + years + " years, the investment is worth " + String.format("%.2f", investment));
   }
}