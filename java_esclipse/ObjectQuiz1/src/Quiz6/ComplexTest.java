package Quiz6;

class Complex {
	
	private double num1;
	private double num2;
	
	public Complex(double num1) {
		this.num1 = num1;
	}
	
	public Complex(double num1, double num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void print() {
		System.out.println(num1 + "  + " + num2 + "i");
	}
}

public class ComplexTest {

	public static void main(String[] args) {
		Complex c1 = new Complex(2.0);
		c1.print();
		Complex c2 = new Complex(1.5, 2.5);
		c2.print();
	}
}
