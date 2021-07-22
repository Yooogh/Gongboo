package geakcheaquiz02;

import java.util.Scanner;

public class URLTest {

	public static void main(String[] args) {
		String ipryeok;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("URL을 입력하세요 : ");
			ipryeok = sc.next();
			if(ipryeok.equals("bye"))
				break;
			if(ipryeok.endsWith("com"))
				System.out.println(ipryeok + "은 'com'으로 끝납니다.");
			if(ipryeok.contains("java"))
				System.out.println(ipryeok + "은 'java'를 포함합니다.");

		}
		sc.close();
	}
}
