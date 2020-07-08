
/* 
 --------------------------------------------------------
  Assignment 2
  Written by: Lucas Catchlove id: 27145640
  For COMP 248 Section EE – Fall 2016

   ** Elephant Game **

  This program associates the result of die rolls to
  different body parts of an elephant. The purpose of 
  the game is to reassemble your elephant before your
  opponent does. The game is one of chance and requires 
  no skill on behalf of the player. 
  
 --------------------------------------------------------
 */


// importing foreign classes

import java.lang.Math; 
import java.util.Scanner; 



public class ElephantGame { // Begins the class definition block for the "StudentSort" application.

	public static void main(String[] args) { // Main method.

		System.out.println("-------------------------------------\n" 
						 + "         **Elephant Game**\n"				// Welcome message. 
						 + "-------------------------------------\n");


	
		int round = 0; 

		// ints related to player 1 that store date about their elephant.
	
		int p1head = 0;
		int p1body = 0;
		int p1ears = 0;
		int p1trunk = 0;
		int p1tail = 0;
		int p1legs = 0;
		int p1Elephant = 0;
		int p1Count = 0;
		
		//ints related to player 2 that store date about their elephant.

		int p2head = 0;
		int p2body = 0;
		int p2ears = 0;
		int p2trunk = 0;
		int p2tail = 0;
		int p2legs = 0;
		int p2Elephant = 0;
		int p2Count = 0; 



		// Beggining of the loop that breaks once one of the players has all of their elephants parts.

		
		while (p1Count < 10 | p2Count < 10) {

			round++;  // Round counter

			// generates a new random interger between 1 and 6 each time the loop repeats itself. 
			int	p1dietoss = (int)(Math.random() * 6) + 1;
			int	p2dietoss = (int)(Math.random() * 6) + 1;


			// The following if statements distribute parts to each player depending on the result of the die roll. 

			if (p1dietoss == 1 && p1trunk < 1) {
				p1trunk++; 
			}

			else if (p1dietoss == 2 && p1head < 1) {
				p1head++;
			}
			else if (p1dietoss == 3 && p1body < 1) {
				p1body++; 
			}

			else if (p1dietoss == 4 && p1tail < 1) {
				p1tail++;
			}
			else if (p1dietoss == 5 && p1legs < 4) {
				p1legs++; 
			}

			else if (p1dietoss == 6 && p1ears < 2) {
				p1ears++;
			}
			

			if (p2dietoss == 1 && p2trunk < 1) {
				p2trunk++; 
			}

			else if (p2dietoss == 2 && p2head < 1) {
				p2head++;
			}
			else if (p2dietoss == 3 && p2body < 1) {
				p2body++; 
			}

			else if (p2dietoss == 4 && p2tail < 1) {
				p2tail++;
			}
			else if (p2dietoss == 5 && p2legs < 4) {
				p2legs++; 
			}

			else if (p2dietoss == 6 && p2ears < 2) {
				p2ears++;
			}
			
		

			System.out.println("*********** Round " + round + " ***********");       			// Prints information about each round. 
			System.out.println("Player 1 rolled a " + p1dietoss + " while Player 2 rolled a " +
								 p2dietoss + ".\n");

			// These statments are used in breaking the about while loop at the correct moment. 
			p1Count = p1head + p1body + p1ears + p1trunk + p1tail + p1legs; 
			p2Count = p2head + p2body + p2ears + p2trunk + p2tail + p2legs;

			
			// The tally of body parts of each players elephant are diplayed. 
			System.out.println("Player 1's elephant has " + p1body + " body, " + p1head + " head, " + p1ears + " ear(s), " 
													+ p1trunk + " trunk, " + p1tail + " tail, and " + p1legs + " leg(s).");
			
			System.out.println("Player 2's elephant has " + p2body + " body, " + p2head + " head, " + p2ears + " ear(s), "
											        + p2trunk + " trunk, " + p2tail + " tail, and " + p2legs + " leg(s).\n");

			
			// These statements are are printed when a player wins followed by a termination of the method. 
			if (p1Count == 10) {
			System.out.println(">>>>> Congratulations to player 1!!! Your elephant has reconstituted itself! <<<<<\n" +
								"			Thanks for playing the Elephant Game!\n");
			return;
			}
			if (p2Count == 10) {
			System.out.println(">>>>> Congratulations to player 2!!! Your elephant has reconstituted itself!  <<<<<\n" +
								"			Thanks for playing the Elephant Game!\n");
			return; 
			}

		


	     }

	}
}


/*

            ___.-~"~-._   __....__
            .'    `    \ ~"~        ``-.
           /` _      )  `\              `\
          /`  a)    /     |               `\
         :`        /      |                 \
    <`-._|`  .-.  (      /   .            `;\\
     `-. `--'_.'-.;\___/'   .      .       | \\
  _     /:--`     |        /     /        .'  \\
 ("\   /`/        |       '     '         /    :`;
 `\'\_/`/         .\     /`~`=-.:        /     ``
   `._.'          /`\    |      `\      /(
                 /  /\   |        `Y   /  \
                J  /  Y  |         |  /`\  \
               /  |   |  |         |  |  |  |
              "---"  /___|        /___|  /__|
                     '"""         '"""  '"""

*/