package quiz;
import java.util.Scanner;
public class quiz04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		int second = scanner.nextInt();
		
		int h = second/(60*60);
		int m = second/60;
		int s = second%60;
		//������ �޴´���������.. ���� ������..
		
		System.out.print(h + "�ð� ");
		System.out.print(m + "�� ");
		System.out.print(s + "��");
		
		scanner.close();		
	}
}
