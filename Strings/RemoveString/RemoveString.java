import java.util.Scanner;

public class RemoveString {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String sentence, string;
      
      System.out.print("Enter a sentence: ");
      sentence = input.nextLine();
      System.out.print("Enter a string: ");
      string = input.nextLine();
      
      String newSentence = sentence.replaceAll(" " + string, "");
      if (newSentence.equals(sentence)) {
         newSentence = sentence.replaceAll(string, "");
      }
      
      System.out.println(newSentence);
   }
}