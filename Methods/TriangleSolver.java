import java.util.Scanner;
import java.lang.Math;

public class TriangleSolver {
   int choice;
   double sideA, sideB, sideC, angleA, angleB, angleC;
   Scanner input = new Scanner(System.in);
 
   public double getAngleFromSSS(double side1, double side2, double side3) {
      double inRadians = Math.acos((side2*side2 + side3*side3 - side1*side1) / (2*side2*side3));
      return Math.toDegrees(inRadians);
   }
   
   public double getAngleFromSSA(double side1, double side2, double angle1) {
      double inRadians = Math.asin(Math.toRadians(side2 / (side1 / Math.toDegrees(Math.sin(Math.toRadians(angle1))))));
      return Math.toDegrees(inRadians);
   }
   
   public double getSideFromSSA(double side1, double side2, double angle1) {
      return Math.toDegrees // use principle of above func ^
   }
   
   public double getSideFromASA(double angle1, double side1, double angle2) {
      return side1 * (Math.sin(Math.toRadians(angle1)) / Math.sin(Math.toRadians(angle2)));
   }
   
   public double getSideFromSAS(double side1, double angle1, double side2) {
      return side2 * Math.cos(Math.toRadians(angle1)) + Math.sqrt(side1*side1 - side2*side2 * Math.pow(Math.sin(Math.toRadians(angle1)), 2));
   }
 
   public void	SSS()	{
      System.out.print("Enter sideA: ");
      sideA = input.nextDouble();
      System.out.print("Enter sideB: ");
      sideB = input.nextDouble();
      System.out.print("Enter sideC: ");
      sideC = input.nextDouble();
      
      angleA = getAngleFromSSS(sideA, sideB, sideC);
      angleB = getAngleFromSSS(sideB, sideA, sideC);
      angleC = 180 - (angleA + angleB);
   }
   
   public void SAS() {
      System.out.print("Enter side1: ");
      sideA = input.nextDouble();
      System.out.print("Enter side2: ");
      sideC = input.nextDouble();
      System.out.print("Enter included angle: ");
      angleC = input.nextDouble();
      
      sideB = getSideFromASA(sideC, angleC, sideA);
      angleB = getAngleFromSSS(sideB, sideC, sideA);
      angleA = 180 - (angleB + angleC);
   }
   
   public void ASA() {
      System.out.print("Enter angle1: ");
      angleA = input.nextDouble();
      System.out.print("Enter angle2: ");
      angleB = input.nextDouble();
      System.out.print("Enter side1: ");
      sideC = input.nextDouble();
      
      angleC = 180 - (angleA + angleB);
      sideA = getSideFromASA(angleA, sideC, angleC);
      sideB = getSideFromASA(angleB, sideA, angleA);
   }
   
   public void SSA() {
      System.out.print("Enter side1: ");
      sideA = input.nextDouble();
      System.out.print("Enter side2: ");
      sideB = input.nextDouble();
      System.out.print("Enter opposite angle: ");
      angleA = input.nextDouble();
      
      if (sideA < sideB * Math.sin(Math.toRadians(angleA))) {
         System.out.println("No Solution");
         System.exit(500);
      } else if (sideA < sideB && sideA > sideB * Math.sin(Math.toRadians(angleA))) {
         System.out.println("Solution 1: ");
         angleB = getAngleFromSSA(sideA, sideB, angleA);
         angleC = 180 - (angleA + angleB);
         System.out.println(angleB);
      }
   }
   
   String roundTo2Dec(double val) {
      return String.format("%.2f", val);
   }
 
   public void	menu() {
      System.out.println("Enter 1 for SSS, 2 SAS, 3 ASA, 4 SSA ");
      choice = input.nextInt();
      switch(choice) {
	      case 1: SSS();	break;
         case 2: SAS(); break;
         case 3: ASA(); break;
         case 4: SSA(); break;
      }
   }
   
   public void display() {
      System.out.println("\nSide\t\tAngle\n" +
       roundTo2Dec(sideA) + "\t\t" + roundTo2Dec(angleA) + "\n" + 
       roundTo2Dec(sideB) + "\t\t" + roundTo2Dec(angleB) + "\n" + 
       roundTo2Dec(sideC) + "\t\t" + roundTo2Dec(angleC));
   }
   
   public void	runner()	{
      menu();
      display();
   }

   public static void main(String[] args) {
      TriangleSolver triangle =	new TriangleSolver();
      triangle.runner();
   }
}