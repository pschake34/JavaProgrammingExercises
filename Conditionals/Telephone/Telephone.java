import java.util.Scanner;

public class Telephone {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char letter;
      int digit = 0;
      
      System.out.print("Enter a single letter, and I will tell you what the corresponding digit is on the telephone: ");
      letter = input.nextLine().charAt(0);
      
      if (letter == 'A' || letter == 'B' || letter == 'C') {
         digit = 2;
      } else if (letter == 'D' || letter == 'E' || letter == 'F') {
         digit = 3;
      } else if (letter == 'G' || letter == 'H' || letter == 'I') {
         digit = 4;
      } else if (letter == 'J' || letter == 'K' || letter == 'L') {
         digit = 5;
      } else if (letter == 'M' || letter == 'N' || letter == 'O') {
         digit = 6;
      } else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
         digit = 7;
      } else if (letter == 'T' || letter == 'U' || letter == 'V') {
         digit = 8;
      } else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
         digit = 9;
      } else {
         System.out.println("Not a valid letter.");
         System.exit(1);
      }
      
      System.out.println("The digit " + digit + " corresponds to the letter " + letter + " on the telephone.");
   }
}