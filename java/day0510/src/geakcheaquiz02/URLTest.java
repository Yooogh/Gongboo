package geakcheaquiz02;

import java.util.Scanner;

public class URLTest {

	public static void main(String[] args) {
		String ipryeok;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("URL�� �Է��ϼ��� : ");
			ipryeok = sc.next();
			if(ipryeok.equals("bye"))
				break;
			if(ipryeok.endsWith("com"))
				System.out.println(ipryeok + "�� 'com'���� �����ϴ�.");
			if(ipryeok.contains("java"))
				System.out.println(ipryeok + "�� 'java'�� �����մϴ�.");

		}
		sc.close();
	}
}
