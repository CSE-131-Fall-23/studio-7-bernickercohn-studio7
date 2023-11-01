package studio7;

public class Fraction {

	private int num;
	private int den;
	public Fraction(int n,int d) {
		this.num = n;
		this.den = d;
	}
	public Fraction addFrac(Fraction f) {
		f = this.num / this.den;
		return f;
	}
}