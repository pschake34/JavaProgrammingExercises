import java.util.Scanner;
public class Digits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int hundreds, tens, ones, number;
        
        System.out.print("Enter a 3 digit number: ");
        number = input.nextInt();
        
        hundreds = number / 100;
        number %= 100;
        tens = number / 10;
        number %= 10;
        ones = number / 1;
        
        System.out.println("\nThe hundreds place digit is: " + hundreds);
        System.out.println("The tens place digit is: " + tens);
        System.out.println("The ones place digit is: " + ones);
    }
}