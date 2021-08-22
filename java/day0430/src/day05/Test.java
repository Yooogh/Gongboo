package day05;

public class Test {

	public int f(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Test t = new Test();
		int sum = t.f(2, 4);
	}
}
