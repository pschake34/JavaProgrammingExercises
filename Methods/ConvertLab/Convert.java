import java.util.*;

public class Convert {
   Scanner input = new Scanner(System.in);
   String num1, num2, operation, convertedResult;
   int base1, base2, firstNum, secondNum, baseResult, result;

   public static void main(String[] args) {
      Convert temp = new Convert();
      temp.getInfo();
   }

   public int convertToBase10(int base, String number) {
      int[] digits = new int[number.length()];
      int inBase10 = 0;
   
      for (int i = 0; i < number.length(); i++) {
         int charInt = number.toLowerCase().charAt(i);
         if (charInt > 57) {  //57 is char value of 9
            digits[i] = charInt - 87;
         } else {
            digits[i] =  charInt - 48;
         }
      }

      int multiple = 1;
      for (int j = digits.length-1; j >= 0; j--) {
         inBase10 += digits[j] * multiple;
         multiple *= base;
      }
      
      return inBase10;
   }

   public String convertFromBase10(int base, int number) {
      ArrayList<Integer> digits = new ArrayList<>();
      String inNewBase = "";

      int tempNumber = number;
      while (tempNumber > 0) {
         digits.add(tempNumber % base);
         tempNumber /= base;
      }

      for (int i = digits.size()-1; i >= 0; i--) {
         int currentItem = digits.get(i);
         if (currentItem > 9) {
            inNewBase = inNewBase + (char) (currentItem + 55);
         } else {
            inNewBase = inNewBase + (char) (currentItem + 48);
         }
      } return inNewBase;
   }

   public void getInfo() {
      System.out.print("Enter the base of the first number: ");
      base1 = input.nextInt();
      input.nextLine();
      System.out.print("Enter the first number: ");
      num1 = input.nextLine();
      System.out.print("\nEnter the base of the second number: ");
      base2 = input.nextInt();
      input.nextLine();
      System.out.print("Enter the second number: ");
      num2 = input.nextLine();
      System.out.print("\nEnter the operation: ");
      operation = input.nextLine();
      System.out.print("\nEnter the base of the result: ");
      baseResult = input.nextInt();
      input.nextLine();
      firstNum = convertToBase10(base1, num1);
      secondNum = convertToBase10(base2, num2);

      if (operation.equals("+")) {
         result = firstNum + secondNum;
      } else if (operation.equals("-")) {
         result = firstNum - secondNum;
      } else if (operation.equals("*")) {
         result = firstNum * secondNum;
      } else if (operation.equals("/")) {
         result = firstNum / secondNum;
      } else if (operation.equals("%")) {
         result = firstNum % secondNum;
      }

      convertedResult = convertFromBase10(baseResult, result);
      System.out.println(num1 + " {" + firstNum + "} " + operation + " " + num2 + " {" + secondNum + "} = " + convertedResult + " {" + result + "}");
   }
}