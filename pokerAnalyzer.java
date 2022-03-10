import java.util.Scanner;
public class pokerAnalyzer
{

	public static void main(String[] args) 
	{
		
		System.out.println("Please enter 5 cards you have in your hand or type \"quit\" to exit the program");
		
		Scanner sc = new Scanner(System.in);				//set a scanner which makes person to input value
		String hand = "";								
		
		while (true) 
		{
			String suit = "";							
			String rank = "";							
			hand = sc.next();							
			if (hand.equals("quit")) break;					//if string hand equals "quit", break works which means 
			
			for(int i = 0; i <= 8; i = i + 2) 				/*since even number has rank values track them 
			 												start with even number i = 0 and add i = i + 2 */
			{
				rank = rank + hand.charAt(i);				//add all the rank variable in string rank string
			}
			
			for (int i2 = 1; i2 <= 9; i2 = i2 + 2) 			/*since odd number has suit values track them start with odd value and 
			 											  	add i2 = i2 + 2 	*/
			{
				suit = suit + hand.charAt(i2);				//add all the suit variable in string suit string
			}			

			boolean isFlush = true;						
			for (int a = 0; a < suit.length(); a++) 		//use for loop to test all the characters in the string suit
			{
				if (suit.charAt(0) != suit.charAt(a)) 		//use if statement to compare whether characters are not the same
				{
						isFlush = false;				
				}
					
			}
			
			boolean fourOfAKind = false;				
			for (int b = 0; b < rank.length(); b++) 		//use for loop to test all the characters in the string rank
			{
				int count1 = 0;								//make a count variable to see how many same characters in a rank
				for(int c = 0; c < rank.length(); c++) 		
				{		
					if (rank.charAt(b) == rank.charAt(c)) 
					{
							count1++;						//add 1 to count1 value when character at b and c are same
					}			
				}
					if (count1 == 4) 						//to show there are 4 same characters in a rank string
					{	
						fourOfAKind = true; 
					}
			}
			
			boolean threeOfAKind = false;
			for (int d = 0; d < rank.length(); d++) 		//use for loop to test all the characters in the string rank
			{
				int count2 = 0;								//make a count variable to see how many same characters in a rank
				for(int e = 0; e < rank.length(); e++) 		
				{	
					if (rank.charAt(d) == rank.charAt(e)) 
					{
							count2++;						//add 1 to count2 value when character at d and e are same
					}
				}
					if (count2 == 3) 						//to show there are 3 same characters in a rank string
					{
						threeOfAKind = true; 
					}
			}
	
			boolean pair = false;
			for (int f = 0; f < rank.length(); f++) 		//use for loop to test all the characters in the string rank
			{
				int count3 = 0;								//make a count variable to see how many same characters in a rank
				for(int g = 0; g < rank.length(); g++) 
				{
					if (rank.charAt(f) == rank.charAt(g)) 
					{
								count3++;					//add 1 to count2 value when character at f and g are same
					}
						
				}
					if (count3 == 2) 						//to show there are 3 same characters in a rank string
					{
							pair = true;
					}
			}
			
			
			if (fourOfAKind) 
			{
				System.out.println("four of a kind");
			}
			else if (threeOfAKind && pair) 					/*since full house is combination of threeOfAKind and pair
															use and boolean expression to make sure those two are happening at same time*/
			{
				System.out.println("full house");
			}
			else if (isFlush) 
			{
				System.out.println("flush");
			}
			else if (threeOfAKind) 
			{
				System.out.println("three of a kind");
			}
			else if (pair) 								
			{
				System.out.println("pair");
			}
			
		}

	}
		
}	