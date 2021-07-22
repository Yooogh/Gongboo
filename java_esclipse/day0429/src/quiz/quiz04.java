package quiz;
import java.util.Scanner;
public class quiz04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("초 단위 정수를 입력하세요 : ");
		int second = scanner.nextInt();
		
		int h = second/(60*60);
		int m = second/60;
		int s = second%60;
		//위에걸 받는다하지말고.. 각자 나누기..
		
		System.out.print(h + "시간 ");
		System.out.print(m + "분 ");
		System.out.print(s + "초");
		
		scanner.close();		
	}
}
