package quiz;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double PI = 3.14;
		
		System.out.println("������� �ظ� ��������? ");
		int r = scanner.nextInt();
		
		System.out.println("������� ���̴�? ");
		int h = scanner.nextInt();
		
		System.out.println("������� ���Ǵ� " + r*r*PI*h);
		
		scanner.close();
	}
}
