import java.util.*;
public class card
{
	private String mySuit="";
	private int myValue;
	
	public card()
	{
	}
	
	public card(int v, int s)
	{
		mySuit = convert(s);
		myValue = v;
		
	}
	
	public card( int v, String s)
	{
		mySuit = s;
		myValue = v;
	}
	
	public String convert(int s)
	{
		switch(s)
		{
			case 1: return "Hearts";
			case 2: return "Diamonds";
			case 3: return "Clubs";
			case 4: return "Spades";
		}
		return "*";
	}
	
	public String face(int num)
	{
		switch(num)
		{
			case 11: return "Jack";
			case 12: return "Queen";
			case 13: return "King";
			case 1: return "Ace";
		}
		
		return ""+num;
	}
	
	public String getSuit()
	{
		return mySuit;
	}
	
	public int getValue()
	{
		return myValue;
	}
	
	public String toString()
	{
		return face(myValue) +" of "+ mySuit;
	}
		
	public static void main (String[] args)
		 {
		 	card temp = new card(12,4);
		 	card temp2 = new card( 7,"Hearts");
		 	System.out.println(temp);
		 	System.out.println(temp2);
		 
				  }
}