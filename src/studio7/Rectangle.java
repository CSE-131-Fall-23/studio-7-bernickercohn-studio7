package studio7;

public class Rectangle {
	private double length;
	private double width;


	public Rectangle(double l, double w) {
		this.length = l;
		this.width = w;

	}
	
	public double getArea() {
		return this.length * this.width;
	}
	
	public double getPerimeter() {
		return 2 * this.length + 2 * this.width;
			
	}
	
	public boolean isSquare () {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller (Rectangle r) {
		if (this.getArea() < r.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}

}
