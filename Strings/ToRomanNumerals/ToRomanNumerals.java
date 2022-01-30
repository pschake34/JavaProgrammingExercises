import java.util.ArrayList;
import java.util.Scanner;

public class ToRomanNumerals {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number between 1 and 3999: ");
      int num = input.nextInt();
      
      System.out.println("Your number in Roman Numerals is: " + toRomanNumeral(num));
   }
   
   public static String toRomanNumeral(int toConvert) {
    String[] ones = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    String[] tens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "DM"};
    String[] thousands = {"", "M", "MM", "MMM"};
    String[][] allPlaces = {ones, tens, hundreds, thousands};
    
    String inRomanNumerals = "";
    ArrayList<Integer> rawDigits = new ArrayList<>();
    int tempToConvert = toConvert;
    
    while (tempToConvert > 0) {
        rawDigits.add(tempToConvert % 10);
        tempToConvert /= 10;
    }
    
    for (int i = 0; i < rawDigits.size(); i++) {
        inRomanNumerals = allPlaces[i][rawDigits.get(i)] + inRomanNumerals;
    } return inRomanNumerals;
}
}