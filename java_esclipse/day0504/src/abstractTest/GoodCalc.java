package abstractTest;

public class GoodCalc extends Calculator{

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int subtract(int a, int b) {
		return a - b;
	}

	@Override
	public int average(int[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++)
		sum += a[i];
		return (int) (sum/a.length);
	}

	public static void main(String[] args) {
		GoodCalc c = new GoodCalc();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[]{2, 3, 4 ,5}));
	}
	
}
