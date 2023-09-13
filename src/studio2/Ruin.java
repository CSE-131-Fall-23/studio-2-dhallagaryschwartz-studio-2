package studio2;

import java.util.Scanner;


public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("what amount of money did you start with");
		double startAmount = in.nextDouble();
		System.out.println("I started with " + startAmount);
		
		System.out.println("what is the chance you win");
		double winChance = in.nextDouble();
		System.out.println("The chance of winning is " + winChance);
		
		System.out.println("What is the win limit?");
		double winLimit = in.nextDouble();
		System.out.println("The win limit is: " + winLimit);
		
		double currentAmount = startAmount;
		//if you win, current amount +1
		int timesPlayed = 0;
		int timesWon = 0;
		int timesLost = 0;
		
		while (currentAmount == 0 || currentAmount < winLimit)	
		{
			timesPlayed += 1;
			double probability = Math.random();
			if (probability < winChance)
			{
				currentAmount +=1;
				timesWon += 1;
			}
			else 
			{
				currentAmount -=1;
				timesLost += 1;
			
			}
		
	
		}
		System.out.println("Times played: " + timesPlayed);
		System.out.println("Times won: " + timesWon);
		System.out.println("Times lost: " + timesLost);
		
		if (currentAmount == 0)
				System.out.println ("you have lost");
		if (currentAmount == winLimit)
			System.out.println("you have won ");
		System.out.println(" How many days are you going to play");
		
		
	
	
		
		for (int totalSimulations = 0; totalSimulations <=10; totalSimulations ++);
		{
			System.out.println(totalSimulations);
		}
		}

	}
	

}
