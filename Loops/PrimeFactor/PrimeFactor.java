import java.util.Scanner;
import java.util.ArrayList;
public class PrimeFactor {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number, tempNumber;
      ArrayList<Integer> primeFactors = new ArrayList<Integer>();
      
      System.out.print("Enter a positive integer: ");
      number = input.nextInt();
      tempNumber = number;
      
      for (int i = 2; i < number / 2; i++) {
         while (tempNumber % i == 0) {
            primeFactors.add(i);
            tempNumber /= i;
         }
      }
      
      System.out.println("The prime factors are as follows: \n" + primeFactors);
   }
}