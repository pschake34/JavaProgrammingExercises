import java.util.Scanner;

public class GCD {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int n1, n2;
      int temp = 0;
      
      System.out.print("Enter a number: ");
      n1 = input.nextInt();
      
      System.out.print("Enter another number: ");
      n2 = input.nextInt();
      
      while (n2 > 0) {
         temp = n1 % n2;
         n1 = n2;
         n2 = temp;
      }
      
      System.out.println("The GCD is " + n1);
   }
}