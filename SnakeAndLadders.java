package SnakeAndLadders;

public class SnakeAndLadders {
<<<<<<< HEAD
	public static final int INITIAL_POSITION =0;
	public static final int NO_OF_PLAYERS =2;
	public static final int NO_PLAY =0;
=======
	public static final int NO_PLAY = 0;
>>>>>>> uc7
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static int PLAYER1_POSITION = 0;
	public static int PLAYER2_POSITION = 0;
	static int PLAYER1_TURN = 1; 
	static int PLAYER2_TURN = 2; 
	public static int PLAYER1_DICE = 0;
	public static int PLAYER2_DICE = 0;

	public static void main(String[] args) {

		System.out.println("Welcome to Snakes and Ladders Game");
<<<<<<< HEAD
		System.out.println("Player starting at Position 0");
		
		int currentPosition = INITIAL_POSITION;
		int move = 0;
		int count = 0;
		
		while(currentPosition != 100) {
			
			int dice = ((int) Math.floor(Math.random()*10)%6)+1;
				count+=1;
				
				//System.out.println("Player rolls the number:"+dice);
			int check = (int) Math.floor(Math.random()*10)%3;
				//System.out.println("check is " + check);
				
			if(check == NO_PLAY)
				currentPosition = currentPosition;
				
			else if(check == LADDER) {
				currentPosition += dice;
				if(currentPosition>100)
						currentPosition-=dice;
			}
					
			else {
				currentPosition -= dice;
				if(currentPosition<INITIAL_POSITION)
					currentPosition = INITIAL_POSITION;
				
=======
		System.out.println("Player 1 and Player 2 start at Position 0");
		while ((PLAYER1_POSITION < 100) && (PLAYER2_POSITION < 100)) {
			int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
			int check = (int) Math.floor(Math.random() * 10) % 3;
			if (PLAYER1_TURN == 1) {
				PLAYER1_DICE++;

				if (check == NO_PLAY) {
					System.out.println("Player 1 remains at same position.");
					PLAYER1_TURN = 0;
					PLAYER2_TURN = 2;
				} else if (check == LADDER) {
					if (PLAYER1_POSITION + dice < 100) {
						PLAYER1_POSITION += dice;
					}
				} else if (check == SNAKE) {
					if (PLAYER1_POSITION - dice > 0)
						PLAYER1_POSITION -= dice;
					else
						PLAYER1_POSITION = 0;
					PLAYER1_TURN = 0;
					PLAYER2_TURN = 2;
>>>>>>> uc7
				}
				System.out.println("The position of player 1 is: " + PLAYER1_POSITION);
			} else if (PLAYER2_TURN == 2) {
				PLAYER2_DICE++;
				if (check == NO_PLAY) {
					System.out.println("The Player 2 remains at same position.");
					PLAYER1_TURN = 1;
					PLAYER2_TURN = 0;
				} else if (check == LADDER) {
					if (PLAYER2_POSITION + dice <= 100)
						PLAYER2_POSITION += dice;
				} else if (check == SNAKE) {
					if (PLAYER2_POSITION - dice > 0)
						PLAYER2_POSITION -= dice;
					else
						PLAYER2_POSITION = 0;
					PLAYER1_TURN = 1;
					PLAYER2_TURN = 0;
				}
				System.out.println("The position of player 2 is: " + PLAYER2_POSITION);
			}
		}
		System.out.println("The Final Position of player 1 :" + PLAYER1_POSITION);
		
		System.out.println("The Final Position of player 2 :" + PLAYER2_POSITION);
		if (PLAYER1_POSITION == 100) {
			System.out.println("Player 1 won and his dice roll count is :" + PLAYER1_DICE);
		} else {
			System.out.println("Player 2 won and his dice roll count is :" + PLAYER2_DICE);
		}
<<<<<<< HEAD
		System.out.println("The player reaches exactly 100 in "+ move +" moves");
		System.out.println("The no of time the dice has been rolled :" + count);
			
	}	
}





=======
	}
}
>>>>>>> uc7
