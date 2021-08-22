import java.util.Scanner;

public class quiz01 {
	static int count =0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		char c = sc.next().charAt(0);
		
		System.out.println(countChar(s, c));
	}

		static int countChar (String s,char c) {
			for(int i = 1; i<s.length(); i++) {
				if(s.charAt(i)==c)
					count++;
				
			}
			return count;
		}
}
