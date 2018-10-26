/*
 * Author: Dustin Senger
 * Created: 10/20/2018
 * Purpose: Create an item that the player must pick up.
 */
public class Item {

	private int count;
	private String image;
	private int yCord;
	private int xCord;
	public Item (int count, String image, int yCord, int xCord) {
		this.count = count;
		this.image = image;
		this.yCord = yCord;
		this.xCord = xCord;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getyCord() {
		return yCord;
	}
	public void setyCord(int yCord) {
		this.yCord = yCord;
	}
	public int getxCord() {
		return xCord;
	}
	public void setxCord(int xCord) {
		this.xCord = xCord;
	}
	
	@Override
	public String toString() {
		return "Count: " + count
				+"\nImage: "+ image
				+"\nyCord: " + yCord
				+"\nxCord: " + xCord;
		
	}
}
