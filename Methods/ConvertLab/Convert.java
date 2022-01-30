import java.util.*;

public class Convert {
   Scanner input = new Scanner(System.in);
   String num1, num2;
   int base1, base2, firstNum, secondNum;

 
   public int convertToBase10( int base, String number) {
      ArrayList<Integer> digits = new ArrayList<Integer>();
   
      for (int i = 0; i < number.length(); i++) {
         if (number.charAt(i) > '9') {
            digits.add(number.toLowerCase().charAt(i) - 86);
         }
      }
      

      return digits.get(0); // change this to return the actual value of the number
   }

   public void getInfo() {
   
      System.out.print("Enter the base of the first number: ");
      base1 = input.nextInt();
      input.nextLine();
      System.out.print("\nEnter the first number: ");
      num1 = input.nextLine();
      System.out.println(num1);
      System.out.print("\nEnter the base of the second number: ");
      base2 = input.nextInt();
      System.out.print("\nEnter the second number: ");
      num2 = input.nextLine();
      firstNum = convertToBase10( base1, num1);
      secondNum = convertToBase10( base2, num2);
      System.out.println(firstNum);


   }

   public static void main(String[] args) {
      Convert temp = new Convert();
      temp.getInfo();
   }

}