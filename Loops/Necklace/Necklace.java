import java.util.Scanner;

public class Necklace {
   public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      int startNum1, startNum2;
            
      System.out.print("Enter the first starting digit: ");
      startNum1 = input.nextInt();
      System.out.print("Enter the second starting digit: ");
      startNum2 = input.nextInt();
      
      int current = startNum2;
      int previous = startNum1;
      
      System.out.print(startNum1 + " " + startNum2);
      
      do {
         int temp = current;
         current  = (previous + current) % 10;
         previous = temp;
         System.out.print(" " + current);
      } while (current != startNum2 || previous != startNum1);
   }
}