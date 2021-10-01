import java.util.Scanner;
public class Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quarters, dimes, nickels, pennies, changeNeeded;
        
        System.out.print("Enter the amount of change needed in cents: ");
        changeNeeded = input.nextInt();
        
        quarters = changeNeeded / 25;
        changeNeeded %= 25;
        dimes = changeNeeded / 10;
        changeNeeded %= 10;
        nickels = changeNeeded / 5;
        changeNeeded %= 5;
        pennies = changeNeeded / 1;
        
        System.out.println("\nThe fewest number of coins needed to make the change is:");
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies: " + pennies);
    }
}