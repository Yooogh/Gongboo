package quiz;
import java.util.Scanner;
public class quiz02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int num = scanner.nextInt();
		
		int jegob = num * num;
		System.out.println(num + "�� ������ " + jegob);
	
		scanner.close();
	}
}
