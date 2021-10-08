import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      int number = rand.nextInt(20+1) + 1;
      System.out.println(number);
      int guess = -1;  
      while (true) {
         System.out.print("Enter a number between 1 and 20: ");
         guess = input.nextInt();
         if (guess == number) {
            System.out.println("You won!");
            break;
         } else {
            System.out.println("Try again.");
         }
      }  
   }
}