package quiz;
import java.util.Scanner;
public class quiz09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		/*
		 * int jeon
		 * 
		 * int gyo
		 * 
		 * int il
		 * 
		 * mim 140 
		 * 
		 * jeon>=70
		 * ((gyo>=30) && (il>=30)) || (gyo + il>=80))
		 * 
		 * 
		 * isu = jeon + gyo + 1l >= 140
		 */

		System.out.println("���� �̼� ���� : ");
		int jeon = sc.nextInt();
		
		System.out.println("���� �̼� ���� : ");
		int gyo = sc.nextInt();
		
		System.out.println("�Ϲ� �̼� ���� : ");
		int il = sc.nextInt();
		
		if ((jeon + gyo + il > 140) && (jeon > 70) && (((gyo>=30) && (il>=30)) || (gyo + il>=80))) {
			System.out.println("���� ����");
			}
		sc.close();
	}
}
