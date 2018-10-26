/*
 * Author: Dustin Senger
 * Created: 10/20/2018
 * Purpose: Create an player that respods to user inputs. 
 */
public class Player {
	
	private String name;
	private String image;
	private int items;
	private int move;
	
	public Player (String name, String image, int items, int move) {
		this.name = name;
		this.image = image;
		this.items = items;
		this.move = move;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getItems() {
		return items;
	}

	public void setItems(int items) {
		this.items = items;
	}

	public int getMove() {
		return move;
	}

	public void setMove(int move) {
		this.move = move;
	}
		
	@Override
	public String toString() {
		return "Name: "+ name+
				"\nImage: " + image + 
				"\nItems: " + items + 
				"\nMove: " + move;
	}
}
