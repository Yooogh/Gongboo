import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String url;
		
		String bye = "bye";
		String com = "com";
		String java = "java";
		
		do {
			System.out.println("URL�� �Է��ϼ��� : ");

			url = sc.next();
			
			if(url.endsWith(com)) 
				System.out.println(url + "��(��) '" + com + "'�� �����ϴ�");
			
			if(url.contains(java))
				System.out.println(url + "��(��) '" + java + "'�� �����մϴ�");
		} while(!url.equals(bye));
		sc.close();
	}
}
