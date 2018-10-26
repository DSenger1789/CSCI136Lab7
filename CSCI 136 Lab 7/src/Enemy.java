/*
 * Author: Dustin Senger
 * Created: 10/20/2018
 * Purpose: Create an enemy that moves at different speeds for different difficulties.
 */
public class Enemy {

	private String image;
	private int move;
	private int timing;
	
	public Enemy (String image, int move, int timing) {
		this.image = image;
		this.move = move;
		this.timing = timing;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}

	public int getTiming() {
		return timing;
	}

	public void setTiming(int timing) {
		this.timing = timing;
	}
	@Override
	public String toString() {
		return "image: " + image
				 +"\nMove: " + move +
				"\nTiming: " + timing;
	}
}
