package geakcheaquiz02;

public class SumTest {
	
	static int sum(int i, int... vars) {
		int total = 0;
		for (int v : vars) {
			total = total + v;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(sum(1, 2, 3));
		int arr[] = {2, 3};
		System.out.println(sum(1, arr));
		}
}
