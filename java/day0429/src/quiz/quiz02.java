package quiz;
import java.util.Scanner;
public class quiz02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int num = scanner.nextInt();
		
		int jegob = num * num;
		System.out.println(num + "의 제곱은 " + jegob);
	
		scanner.close();
	}
}
