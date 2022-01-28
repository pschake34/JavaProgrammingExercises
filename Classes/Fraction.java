import java.util.*;
public class Fraction
{
	Scanner input = new Scanner(System.in);
	private int myNum, myDenom;
	
	
	public Fraction()
	{
		myNum = 0;
		myDenom = 1;
	}
	public Fraction(int n, int d)
	{
		myNum = n;
		myDenom = d;
	}
	
	public int getNum()
	{ 
	  return myNum;
	
	}
	
	public int getDenom()
	{
		return myDenom;
		
		
	}
	
	public void setNum(int n)
	{
		myNum = n;
	}
	public void setDenom(int d)
	{
		myDenom = d;
	}
	
	public void getInfo()
	{
		System.out.print(" Enter the numerator of the fraction : ");
		myNum = input.nextInt();
		System.out.print(" Enter the denominator of the fraction : ");
		myDenom = input.nextInt();
	}
	
	public void reduce()
	{
		int small = 1;
		if (myNum <= myDenom)
		  small = myNum;
		else small = myDenom;
		
		while(myNum%small != 0 || myDenom%small != 0)
		  {small-- ;}
		 
		 myNum /= small;
		 myDenom /= small; 
	}
	
	/*
	public String toString()
	{
		return myNum+" / "+myDenom;
	}
*/
	public Fraction Add(Fraction other)
	{
		int num3, denom3;
		denom3 = this.getDenom()*other.getDenom();
		num3 =this.getNum()*other.getDenom() + this.getDenom()*other.getNum();
			
			Fraction temp =new Fraction (num3, denom3);
			temp.reduce();
			return temp;
	}
   
   //need to do Subtract, Multiply, Divide
   
	public static void main(String[] args)
	{
		Fraction frac1 = new Fraction(1,2);
		Fraction frac2 = new Fraction(1,3);
		Fraction frac3 = new Fraction();
		frac3 = frac1.Add(frac2);
		System.out.println(frac3);
	//	frac1.setNum(3);
		//System.out.println(frac2);
		frac3.getInfo();
		frac3.reduce();
		System.out.println(frac3);
		/*frac3 = frac1;
		System.out.println(frac3);
		System.out.println(frac1==frac3);*/
	}
}