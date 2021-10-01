import java.util.Scanner;

public class Eggs {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int numEggs;
      double pricePerEgg = 0.5 / 12;
      double total;
      
      System.out.print("Enter the number of eggs purchased: ");
      numEggs = input.nextInt();
      
      if (numEggs >= (11 * 12)) {
         pricePerEgg = 0.35 / 12;
      } else if (numEggs >= (6 * 12)) {
         pricePerEgg = 0.4 / 12;
      } else if (numEggs >= (4 * 12)) {
         pricePerEgg = 0.45 / 12;
      }
      
      total = numEggs * pricePerEgg;
      
      System.out.println("Your bill is: $" + String.format("%.2f", total));
   }
}