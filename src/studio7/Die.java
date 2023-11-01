package studio7;

public class Die {

	private int sides;
	public Die(int n) {
		this.sides = n;	
	}
	public int rollDie() {
		int number = (int)(Math.random()*(this.sides+1));
		return number;
	}
}
