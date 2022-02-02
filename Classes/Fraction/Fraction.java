import java.util.*;
public class Fraction
{
	Scanner input = new Scanner(System.in);
	private int myNum, myDenom;
	
	
	public Fraction()	{
		myNum = 0;
		myDenom = 1;
	}
   
	public Fraction(int n, int d)	{
		myNum = n;
		myDenom = d;
	}
	
	public int getNum() { 
	  return myNum;
	}
	
	public int getDenom() {
		return myDenom;
	}
	
	public void setNum(int n) {
		myNum = n;
	}
   
	public void setDenom(int d) {
		myDenom = d;
	}
	
	public void getInfo() {
		System.out.print("Enter the numerator of the fraction: ");
		myNum = input.nextInt();
		System.out.print("Enter the denominator of the fraction: ");
		myDenom = input.nextInt();
	}
	
	public void reduce()	{
		int small = 1;
		if (myNum <= myDenom)
		  small = myNum;
		else small = myDenom;
		
		while(myNum%small != 0 || myDenom%small != 0)
		  {small-- ;}
		 
		 myNum /= small;
		 myDenom /= small; 
	}
	
	public String toString() {
		return myNum+"/"+myDenom;
	}

	public Fraction Add(Fraction other)	{
		int num3, denom3;
		denom3 = this.getDenom()*other.getDenom();
		num3 =this.getNum()*other.getDenom() + this.getDenom()*other.getNum();
			
      Fraction temp = new Fraction(num3, denom3);
      temp.reduce();
      return temp;
	}
   
   public Fraction Subtract(Fraction other) {
      int num3, denom3;
      denom3 = this.getDenom()*other.getDenom();
      num3 = this.getNum()*other.getDenom() - this.getDenom()*other.getNum();
      
      Fraction temp = new Fraction(num3, denom3);
      temp.reduce();
      return temp;
   }
   
   public Fraction Multiply(Fraction other) {
      int num3, denom3;
      denom3 = this.getDenom()*other.getDenom();
      num3 = this.getNum()*other.getNum();
      
      Fraction temp = new Fraction(num3, denom3);
      temp.reduce();
      return temp;
   }
   
   public Fraction Divide(Fraction other) {
      int num3, denom3;
      denom3 = this.getDenom()*other.getNum();
      num3 = this.getNum()*other.getDenom();
      
      Fraction temp = new Fraction(num3, denom3);
      temp.reduce();
      return temp;
   }
      
	public static void main(String[] args)	{
		Fraction frac1 = new Fraction();
		Fraction frac2 = new Fraction();
		Fraction frac3 = new Fraction();
      
      System.out.println("Fraction 1: ");
      frac1.getInfo();
      
      System.out.println("\nFraction 2: ");
      frac2.getInfo();
      
      System.out.println("\nResults: ");
      System.out.print(frac1 + " + " + frac2 + " = ");
		frac3 = frac1.Add(frac2);
		System.out.println(frac3);

      System.out.print(frac1 + " - " + frac2 + " = ");
      frac3 = frac1.Subtract(frac2);
      System.out.println(frac3);
      
      System.out.print(frac1 + " * " + frac2 + " = ");
      frac3 = frac1.Multiply(frac2);
      System.out.println(frac3);
      
      System.out.print(frac1 + " / " + frac2 + " = ");
      frac3 = frac1.Divide(frac2);
      System.out.println(frac3);
  	}
}