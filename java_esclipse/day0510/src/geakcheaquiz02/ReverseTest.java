package geakcheaquiz02;

public class ReverseTest {
//역순 정렬
	public static int[] reverse(int[] org) {
		int[] des = new int[org.length];
		
		for(int i = 0, j = des.length-1; i<org.length; i++, j--) {
			des[j] = org[i];
		}
		return des;
	}
	public static void main(String[] args) {
		int[] data = {1, 3, 5, 7, 9};
		int[] result = reverse(data);
		
		for(int i : result)
			System.out.println(i + " ");
	}
}
