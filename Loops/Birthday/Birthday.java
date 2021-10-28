import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
import java.lang.Integer;

public class Birthday {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int day, month, year, total=0;
      List<Integer> monthValues = Arrays.asList(1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6);
      List<String> dayValues = Arrays.asList("Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday");
      
      System.out.print("Enter your birthday in mm-dd yy format: ");
      String userInput = input.nextLine();
      
      try {
         month = Integer.parseInt(userInput.substring(0, 2));
         day = Integer.parseInt(userInput.substring(3, 5));
         year = Integer.parseInt(userInput.substring(6, 8));
         
         total += year / 4;
         total += year;
         total += day;
         total += monthValues.get(month - 1);
         
         if (month < 3) {
            total += isLeapYear(year);
         }
         
         System.out.println("Your Birthday fell on a " + dayValues.get(total % 7));
      } catch (NumberFormatException ex) {
         System.out.println("Invalid Input!");
      }
   }
   
   public static int isLeapYear(int year) {
      if (year % 4 == 0) {
         return -1;
      } 
      return 0;
   }
}