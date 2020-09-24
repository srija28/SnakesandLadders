package SnakeAndLadders;

public class SnakeAndLadders {
	public static final int INITIAL_POSITION =0;
	public static final int NO_OF_PLAYERS =1;
	public static void main(String[] args) {
		System.out.println("Welcome to Snakes and Ladders Game");
		System.out.println("Player starting at Position 0");
		int dice = ((int) Math.floor(Math.random()*10)%6)+1;
		System.out.println("Player rolls the number:"+dice);
	}	
}
