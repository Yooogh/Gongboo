package quiz;
import java.util.Scanner;
public class quiz01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�Ƕ�̵��� ������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		//i	j	k
		//0	1	4
		//1	3	3
		//2	5	2
		//3	7 	1
		//4	9	0
		for(int i = 0; i < num; i++) {
			for(int k = 1; k < num-i; k++) {
				//K < num-1�̸� ���ʿ� ����
				System.out.print(" ");
			}
			for(int j = 0; j < i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
