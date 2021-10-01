import java.util.Scanner;
public class JulianDay {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int julianDay, intDayOfWeek;
      String dayOfWeek = "Sunday";
      
      System.out.print("Enter a Julian day number: ");
      julianDay = input.nextInt();
      
      intDayOfWeek = (julianDay + 1) % 7;
      
      if (intDayOfWeek == 1) {
         dayOfWeek = "Monday";
      } else if (intDayOfWeek == 2) {
         dayOfWeek = "Tuesday";
      } else if (intDayOfWeek == 3) {
         dayOfWeek = "Wednesday";
      } else if (intDayOfWeek == 4) {
         dayOfWeek = "Thursday";
      } else if (intDayOfWeek == 5) {
         dayOfWeek = "Friday";
      } else if (intDayOfWeek == 6) {
         dayOfWeek = "Saturday";
      }
      
      System.out.println("Julian day number " + julianDay + " is a " + dayOfWeek); 
   }
}