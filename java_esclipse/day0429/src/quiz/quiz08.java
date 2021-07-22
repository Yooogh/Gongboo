package quiz;
import java.util.Scanner;
public class quiz08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int sum;
		
		System.out.println("0~999 사이의 숫자를 입력하세요 : ");
		num = scanner.nextInt();

		sum = (num /100) + (num % 100 / 10) + (num % 100 % 10);
		System.out.println("각 자릿수의 합 = " + sum);
		
		scanner.close();
	}
}
