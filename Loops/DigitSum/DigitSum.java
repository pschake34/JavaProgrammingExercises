import java.util.Scanner;
public class DigitSum {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      long number, digitSum, places, tempNumber;
      places = 1;
      digitSum = 0;
      
      System.out.print("Enter a positive integer: ");
      number = input.nextLong();
      tempNumber = number;
            
      while (tempNumber > 0) {
         places *= 10;
         tempNumber = number;
         tempNumber /= places;
      }
      
      while (number > 0) {
         places /= 10;
         digitSum += number / places;
         number %= places;
      }
      
      System.out.println("The sum of the digits is: " + digitSum);
   }
}