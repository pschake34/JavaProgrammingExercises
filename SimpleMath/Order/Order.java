import java.util.Scanner;
public class Order {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int burgers, fries, sodas;
        double subTotal, total, tax, tendered, change;
        
        System.out.print("Enter the number of burgers: ");
        burgers = input.nextInt();
        System.out.print("Enter the number of fries: ");
        fries = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        sodas = input.nextInt();
        
        subTotal = (burgers * 1.69) + (fries * 1.09) + (sodas * 0.99);
        tax = subTotal * 0.065;
        total = subTotal + tax;
        
        System.out.println("\nTotal before tax: $" + String.format("%.2f", subTotal));
        System.out.println("Tax: $" + String.format("%.2f", tax));
        System.out.println("Final total: $" + String.format("%.2f", total));
        
        while (true) {
            System.out.print("\nEnter amount tendered: $");
            tendered = input.nextDouble();
            
            change = tendered - total;
        
            if (change < 0) {
                System.out.println("The customer did not give you enough money!");
                total -= tendered;
                System.out.println("The remaining balance is: $" + String.format("%.2f", total));
            } else {
                System.out.println("Change: $" + String.format("%.2f", change));
                break;
            }
        }
    }
}