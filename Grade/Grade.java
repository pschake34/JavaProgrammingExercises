import java.util.Scanner;
public class Grade {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int grade;
      String letterGrade = "F";
      
      System.out.print("Enter the percentage: ");
      grade = input.nextInt();
      
      if (grade >= 90) {
         letterGrade = "A";
      } else if (grade >= 80) {
         letterGrade = "B";
      } else if (grade >= 70) {
         letterGrade = "C";
      } else if (grade >= 60) {
         letterGrade = "D";
      }
      
      System.out.println("The corresponding letter grade is: " + letterGrade);
   }
}