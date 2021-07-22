package quiz;

import java.util.Scanner;

public class quiz03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double PI = 3.14;
		
		System.out.println("원기둥의 밑면 반지름은? ");
		int r = scanner.nextInt();
		
		System.out.println("원기둥의 높이는? ");
		int h = scanner.nextInt();
		
		System.out.println("원기둥의 부피는 " + r*r*PI*h);
		
		scanner.close();
	}
}
