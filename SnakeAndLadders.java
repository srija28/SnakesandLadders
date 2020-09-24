package SnakeAndLadders;

public class SnakeAndLadders {
	public static final int INITIAL_POSITION =0;
	public static final int NO_OF_PLAYERS =1;
	public static final int NO_PLAY =0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snakes and Ladders Game");
		System.out.println("Player starting at Position 0");
		
		int currentPosition = INITIAL_POSITION;
		int move = 0;
		
		while(currentPosition<100) {
			int dice = ((int) Math.floor(Math.random()*10)%6)+1;
			//System.out.println("Player rolls the number:"+dice);
			int check = (int) Math.floor(Math.random()*10)%3;
			//System.out.println("check is " + check);
			
			if(check == NO_PLAY)
				currentPosition = currentPosition;
			else if(check == LADDER)
				currentPosition += dice;
			else {
				currentPosition -= dice;
				if(currentPosition<INITIAL_POSITION)
					currentPosition = INITIAL_POSITION;
			
				}
			move+=1;
		}
		System.out.println("The player reaches 100 in "+ move +"moves");
			
	}	
}
