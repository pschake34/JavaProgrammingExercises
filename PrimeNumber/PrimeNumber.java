import java.util.Scanner;
public class PrimeNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      long lowerLimit, upperLimit;
         
      System.out.print("Enter a starting number: ");
      lowerLimit = input.nextLong();
      System.out.print("Enter an upper limit: ");
      upperLimit = input.nextLong();
      
      System.out.print("The primes between the two numbers are as follows: \n\n");
      
      for (long n = lowerLimit; n <= upperLimit; n++) {
         boolean isPrime = true;
         if (n % 2 == 0) {
            isPrime = false;
         } else {
            for (int i = 3; i <= n / 2; i += 2) {
              if (n % i == 0) {
                 isPrime = false;
                 break;
              }
            }
         }
         if (isPrime) {
            System.out.print(n + "\t");
         }
      }
   }
}