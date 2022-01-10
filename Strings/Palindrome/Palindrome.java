import java.util.Scanner;

public class Palindrome {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a word or phrase: ");
      String phrase = input.nextLine();
      
      char[] charPhrase = new char[phrase.length()];
      char[] reversePhrase = new char[charPhrase.length];
      
      int reverseIndex = charPhrase.length - 1;
      for (int i = 0; i < charPhrase.length; i++) {
         reversePhrase[reverseIndex] = charPhrase[i];
         reverseIndex--;
      }
      System.out.println(reversePhrase);
      
      if (charPhrase == reversePhrase) {
         System.out.println("The phrase is a palindrome.");
      } else {
         System.out.println("The phrase is not a palindrome.");
      }
   }
}