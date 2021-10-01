import java.util.Scanner;
public class DivAndMod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOne, numTwo, oneDivTwo, twoDivOne, oneModTwo, twoModOne;
        
        System.out.print("Enter an integer: ");
        numOne = input.nextInt();
        System.out.print("Enter a second integer: ");
        numTwo = input.nextInt();
        
        oneDivTwo = numOne / numTwo;
        twoDivOne = numTwo / numOne;
        oneModTwo = numOne % numTwo;
        twoModOne = numTwo % numOne;
        
        System.out.println("\n" + numOne + " / " + numTwo + " = " + oneDivTwo);
        System.out.println(numTwo + " / " + numOne + " = " + twoDivOne);
        System.out.println("\n" + numOne + " % " + numTwo + " = " + oneModTwo);
        System.out.println(numTwo + " % " + numOne + " = " + twoModOne);
    }
}