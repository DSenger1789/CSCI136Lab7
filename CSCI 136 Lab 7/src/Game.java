import java.util.Scanner;

/*
 * Author: Dustin Senger
 * Created: 10/20/2018
 * Purpose: The main driver for the game that will display the graphics and images needed. 
 */
public class Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = null;
		String image = null;
		int items = 0;
		int move = 0;
		int timing = 0;
		int count = 0;
		int yCord = 0;
		int xCord = 0;
		
		Player player1 = new Player(name, image, items, move);
		Item item = new Item(count, image, yCord, xCord);
		Enemy enemy1 = new Enemy(image, move, timing);
		
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("What is the player name?");
		name = myScan.nextLine();
		player1.setName(name);
		
		System.out.println("What is the player image?");
		image = myScan.nextLine();
		player1.setImage(image);
		
		System.out.println("How many items does the player have?");
		items = myScan.nextInt();
		myScan.nextLine();
		player1.setItems(items);
		
		System.out.println("How what direction did the player move?");
		move = myScan.nextInt();
		myScan.nextLine();
		player1.setMove(move);
		
		System.out.println("How many items are on the field?");
		count = myScan.nextInt();
		myScan.nextLine();
		item.setCount(count);
		
		System.out.println("What is the mame of the item image?");
		image = myScan.nextLine();
		item.setImage(image);
		
		System.out.println("What is the y cordinate of an item?");
		yCord = myScan.nextInt();
		myScan.nextLine();
		item.setyCord(yCord);
		
		System.out.println("What is the x cordinate of an item?");
		xCord = myScan.nextInt();
		myScan.nextLine();
		item.setxCord(xCord);
		
		System.out.println("What is the mame of the enemy image?");
		image = myScan.nextLine();
		enemy1.setImage(image);
		
		System.out.println("How what direction did the enemy move?");
		move = myScan.nextInt();
		myScan.nextLine();
		enemy1.setMove(move);
		
		System.out.println("When did the enemy spawn?");
		move = myScan.nextInt();
		myScan.nextLine();
		enemy1.setMove(move);
		
		System.out.println(player1.toString());
		System.out.println(item.toString());
		System.out.println(enemy1.toString());
		
	}

}
