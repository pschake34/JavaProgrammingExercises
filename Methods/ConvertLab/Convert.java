
import java.util.*;
public class Convert
{
  Scanner input = new Scanner(System.in);
  String num1, num2;
  int base1, base2, firstNum, secondNum;

 
public int convertToBase10( int base, String number)
{



  return base; // change this to return the actual value of the number
}

public void getInfo()
{
   
  System.out.print(" Enter the base of the first number :");
  base1 = input.nextInt();
  input.nextLine();
  System.out.print(" Enter the first number :");
  num1 = input.nextLine();
  System.out.print(" Enter the base of the second number :");
  base2 = input.nextInt();
  input.nextLine();
  System.out.print(" Enter the second number :");
  num2 = input.nextLine();
  firstNum = convertToBase10( base1, num1);
  secondNum = convertToBase10( base2, num2);



}

public static void main(String[] args)
{
  Convert temp = new Convert();
  temp.getInfo();
}

}