package quiz;
import java.util.Scanner;
public class quiz08 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num;
		int sum;
		
		System.out.println("0~999 ������ ���ڸ� �Է��ϼ��� : ");
		num = scanner.nextInt();

		sum = (num /100) + (num % 100 / 10) + (num % 100 % 10);
		System.out.println("�� �ڸ����� �� = " + sum);
		
		scanner.close();
	}
}
