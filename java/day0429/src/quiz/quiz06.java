package quiz;
import java.util.Scanner;
public class quiz06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double f = scanner.nextDouble();
		double c;
		
		c = (5.0 / 9.0) * (f - 32);
		System.out.println(c);
		
		scanner.close();
	}
}
