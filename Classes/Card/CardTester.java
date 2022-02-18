import java.util.*;

public class CardTester
{
	
	public static void main(String[] args)
	{
		int faceCard = 0;
		card[] hand = new card[10];
		Random rand = new Random();
		int val, suit;
		for( int i = 0; i < hand.length; i++)
		{
			val = rand.nextInt(13)+1;
			suit = rand.nextInt(4)+1;
			hand[i] = new card(val,suit);
		}
		
		for( card temp: hand)
		{
			System.out.println(temp);
		}
		
		for( card temp2 : hand)
		{
			if( temp2.getValue()>10)
				faceCard++;
		}
		System.out.println("# of face Cards = "+faceCard);
	}
}