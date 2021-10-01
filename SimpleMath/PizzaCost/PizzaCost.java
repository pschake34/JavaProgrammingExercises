import java.util.Scanner;
public class PizzaCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double labor = 0.75;
        double rent = 1;
        double materials = 0.05;
        
        System.out.print("Enter the diameter of the pizza: ");
        int diameter = input.nextInt();
        
        double totalCost = labor + rent + materials * diameter * diameter;
        System.out.println("The total cost of the pizza is " + totalCost);
    }
}