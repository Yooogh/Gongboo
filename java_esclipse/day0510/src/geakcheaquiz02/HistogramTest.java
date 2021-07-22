package geakcheaquiz02;

import java.util.Scanner;

public class HistogramTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int[] freq = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		
		System.out.println("숫자를 10개 입력하세요.");
		for(int i = 0; i<10; i++) {
			x = sc.nextInt();
			if(x>=0)
				freq[x / freq.length]++;
		}
		
		for(int i = 0; i<freq.length; i++) {
			System.out.printf("%2d ~ %2d : ", i*10, (i+1)*10-1);
			for(int k = 0; k < freq[i]; k++)
				System.out.println("*");
			System.out.println();
		}
		sc.close();
	}
}
