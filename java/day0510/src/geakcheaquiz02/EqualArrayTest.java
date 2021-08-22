package geakcheaquiz02;

public class EqualArrayTest {
	
	public static boolean eq(int[] a, int[] b) {
		if(a.length != b.length)
			return false;
		for(int i = 0; i < a.length; i++) {
			if (a[i] != b[i])
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		int[] a = {3, 2, 4, 1, 5};
		int[] b = {3, 2, 4, 1};
		int[] c = {3, 2, 4, 1, 5};
		int[] d = {2, 7, 1, 8, 2};
		
		System.out.println(eq(a, a));
		System.out.println(eq(a, b));
		System.out.println(eq(a, c));
		System.out.println(eq(a, d));
	}
}
