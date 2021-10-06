import java.util.Scanner;

public class DigitDisplay {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      long number;
      long places = 1;
      
      System.out.print("Enter a positive integer: ");
      number = input.nextLong();
      long tempNumber = number;
      
      while (tempNumber > 0) {
         places *= 10;
         tempNumber = number;
         tempNumber /= places;
      }
      
      while (number > 0) {
         places /= 10;
         System.out.println(number / places);
         number %= places;
      }
   }
}