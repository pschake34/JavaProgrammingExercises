import java.util.Scanner;
import java.util.Arrays;

public class Palindrome {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      char[] toRemove = {' ', ',', '.', ';', ':', '!', '?', '(', ')', '"', '\''};
      
      System.out.print("Enter a word or phrase: ");
      String phrase = input.nextLine();
      phrase = phrase.toLowerCase();
      
      char[] tempCharPhrase = new char[phrase.length()];
      int charPhraseLength = 0;
      for (int i = 0; i < phrase.length(); i++) {
         if (new String(toRemove).indexOf(phrase.charAt(i)) == -1) {
            tempCharPhrase[charPhraseLength] = phrase.charAt(i);
            charPhraseLength++;
         } else {
            continue;
         }
      }
      
      char[] charPhrase = new char[charPhraseLength];
      for (int i = 0; i < charPhraseLength; i++) {
         charPhrase[i] = tempCharPhrase[i];
      }
      
      char[] reversePhrase = new char[charPhraseLength];
      
      int reverseIndex = charPhrase.length - 1;
      for (int i = 0; i < charPhrase.length; i++) {
         reversePhrase[reverseIndex] = charPhrase[i];
         reverseIndex--;
      }
            
      if (Arrays.equals(charPhrase, reversePhrase)) {
         System.out.println("The phrase is a palindrome.");
      } else {
         System.out.println("The phrase is not a palindrome.");
      }
   }
}