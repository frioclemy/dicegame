package dicegame;

import java.util.Random;
import java.lang.Thread.sleep;

public class DiceGame {

	public static void diceRoll(int roll) {
		switch (roll) {
			case 1 :
				System.out.println("___________________");
				System.out.println("|                 |");
				System.out.println("|                 |");
				System.out.println("|                 |");
				System.out.println("|        *        |");
				System.out.println("|       ***       |");
				System.out.println("|        *        |");
				System.out.println("|                 |");
				System.out.println("|                 |");
				System.out.println("|_________________|");
				break;
			case 2 :
				System.out.println("___________________");
				System.out.println("|                 |");
				System.out.println("|             *   |");
				System.out.println("|            ***  |");
				System.out.println("|             *   |");
				System.out.println("|                 |");
				System.out.println("|   *             |");
				System.out.println("|  ***            |");
				System.out.println("|   *             |");
				System.out.println("|_________________|");
				break;
			case 3 :
				System.out.println("___________________");
				System.out.println("|                 |");
				System.out.println("|              *  |");
				System.out.println("|             *** |");
				System.out.println("|        *     *  |");
				System.out.println("|       ***       |");
				System.out.println("|  *     *        |");
				System.out.println("| ***             |");
				System.out.println("|  *              |");
				System.out.println("|_________________|");
				break;
			case 4 :
				System.out.println("___________________");
				System.out.println("|                 |");
				System.out.println("|  *           *  |");
				System.out.println("| ***         *** |");
				System.out.println("|  *           *  |");
				System.out.println("|                 |");
				System.out.println("|  *           *  |");
				System.out.println("| ***         *** |");
				System.out.println("|  *           *  |");
				System.out.println("|_________________|");
				break;
			case 5 :
				System.out.println("___________________");
				System.out.println("|                 |");
				System.out.println("|  *           *  |");
				System.out.println("| ***         *** |");
				System.out.println("|  *     *     *  |");
				System.out.println("|       ***       |");
				System.out.println("|  *     *     *  |");
				System.out.println("| ***         *** |");
				System.out.println("|  *           *  |");
				System.out.println("|_________________|");
				break;
			case 6 :
				System.out.println("___________________");
				System.out.println("|                 |");
				System.out.println("|  **         **  |");
				System.out.println("|                 |");
				System.out.println("|                 |");
				System.out.println("|  **         **  |");
				System.out.println("|                 |");
				System.out.println("|                 |");
				System.out.println("|  **         **  |");
				System.out.println("|_________________|");
				break;
				
		}
	}
	
		public static void main(String[] args) {
			
			Random rand = new Random(); 
			int rollPlayer = rand.nextInt(6) + 1;
			int rollCPU = rand.nextInt(6) + 1;
			
			System.out.println("\nPlayer roll the dice ...");
			diceRoll(rollPlayer);
			System.out.println("\nCPU roll the dice ...");
			diceRoll(rollCPU);
			
			if (rollPlayer > rollCPU)
				System.out.println("\n You win !");
				else if (rollCPU > rollPlayer)	
				System.out.println("\nYou loose !");
				else if (rollPlayer == rollCPU)
				System.out.println("\nIt's a draw !");
	}		
}
