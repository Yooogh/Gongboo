package quiz;
import java.util.Scanner;
public class quiz05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char c = scanner.nextLine().charAt(0);
		//스캐너의 스트링 변수를 캐릭터 변수로 받고 싶으면 nextLine.charAt(0)
		int a = ((int)'C' - (int)'c');
		// (char)((int)c + a)
		System.out.println((char)((int)c + a));
		
		scanner.close();
	}
}
