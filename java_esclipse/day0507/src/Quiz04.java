import java.util.Scanner;

public class Quiz04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String url;
		
		String bye = "bye";
		String com = "com";
		String java = "java";
		
		do {
			System.out.println("URL을 입력하세요 : ");

			url = sc.next();
			
			if(url.endsWith(com)) 
				System.out.println(url + "은(는) '" + com + "'로 끝납니다");
			
			if(url.contains(java))
				System.out.println(url + "은(는) '" + java + "'를 포함합니다");
		} while(!url.equals(bye));
		sc.close();
	}
}
