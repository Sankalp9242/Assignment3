package Projects;

import java.util.Scanner;




class Guess
{
	Scanner sc=new Scanner(System.in);
	int guessNum;
	int guessNumber()
	{
		System.out.println("Guesser please guess the number");
		System.out.println("Guesser the number should be under 50");
		System.out.print("Guess the number=");
		
		 guessNum=sc.nextInt();
		 return guessNum;
	}
	int player(int... a)
	{
		System.out.println("Player " +a[0] +" guess the number:");
		int playerNum=sc.nextInt();
		return playerNum;
				
				
		
	}
	
	void hint()
	{
		System.out.println("Anyone want to take a hint!");
		System.out.println("1:Player1");
		System.out.println("2:Player2");
		System.out.println("3:Player3");
		System.out.println("Please enter the number according to your Number");
		int num=sc.nextInt();
		switch (num)
		{
		case 1:
		{
				
					if(guessNum<=10)
					{
						System.out.println("Guesser1 the number is between 1 to 10");
						break;
					}
					else if (guessNum<=20 && guessNum>10)
					{
						System.out.println("Guesser1 the number is between 11 to 20");
						break;
					}
					else if (guessNum<=30 && guessNum>20)
					{
						System.out.println("Guesser1 the number is between 21 to 30");
						break;
					}
					else if (guessNum<=40 && guessNum>30)
					{
						System.out.println("Guesser1 the number is between 31 to 40");
						break;
					}
					else 
					{
						System.out.println("Guesser1 the number is between 41 to 50");
						break;
					}
		    }
				
		case 2:
			if(guessNum<=10)
			{
				System.out.println("Guesser2 the number is between 1 to 10");
				break;
			}
			else if (guessNum<=20 && guessNum>10)
			{
				System.out.println("Guesser2 the number is between 11 to 20");
				break;
			}
			else if (guessNum<=30 && guessNum>20)
			{
				System.out.println("Guesser2 the number is between 21 to 30");
				break;
			}
			else if (guessNum<=40 && guessNum>30)
			{
				System.out.println("Guesser2 the number is between 31 to 40");
				break;
			}
			else 
			{
				System.out.println("Guesser2 the number is between 41 to 50");
				break;
			}
			
		case 3:
			if(guessNum<=10)
			{
				System.out.println("Guesser3 the number is between 1 to 10");
				break;
			}
			else if (guessNum<=20 && guessNum>10)
			{
				System.out.println("Guesser3 the number is between 11 to 20");
				break;
			}
			else if (guessNum<=30 && guessNum>20)
			{
				System.out.println("Guesser3 the number is between 21 to 30");
				break;
			}
			else if (guessNum<=40 && guessNum>30)
			{
				System.out.println("Guesser3 the number is between 31 to 40");
				break;
			}
			else 
			{
				System.out.println("Guesser3 the number is between 41 to 50");
				break;
			}

	
		}
		
	}
	void umpire()
	{
		
		Guess g=new Guess();
		int guessnum=g.guessNumber();
		int player1=g.player(1);
		int player2=g.player(2);
		int player3=g.player(3);
	    if(guessnum==player1 && guessnum==player2 && guessnum==player3)
	    	{
	    	System.out.println("all players are winers");
	    	
	    }
	    else if (guessnum==player1 && guessnum==player2) {
			System.out.println("player1 and player2 guess the correct number");
		}
	    else if (guessnum==player2 && guessnum==player3) {
			System.out.println("player2 and player3 guess the correct number");
		}
	    else if (guessnum==player1 && guessnum==player3) {
			System.out.println("player1 and player3 guess the correct number");
		}
	    else if (guessnum==player1) {
			System.out.println("player1 guess the correct number");
		}
	    else if ( guessnum==player2) {
			System.out.println(" player2 guess the correct number");
		}
	    else if ( guessnum==player3)
	    {
			System.out.println("player3 guess the correct number");
		}
	    else {
			System.out.println("No one guessed the correct Number");
			g.hint();
		}
	    
	}
}

public class GuesserGame
{
	public static void main(String[] args) 
	{
		Guess g=new Guess();
		g.umpire();
	
	
		
		
	}

}

