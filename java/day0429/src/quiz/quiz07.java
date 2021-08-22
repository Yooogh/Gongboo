package quiz;
import java.util.Scanner;
public class quiz07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		
		System.out.println((x%4 == 0) && (x%5 == 0));
		System.out.println((x%4 == 0) || (x%5 == 0));
		System.out.println((x%4 == 0) ^ (x%5 == 0));
		//x%4 == 0 -> true
		//&&
		//x%5 == 0 -> true
		
		scanner.close();
	}
}
