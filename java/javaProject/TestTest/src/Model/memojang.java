package Model;

import java.util.Scanner;

public class memojang {

	public static void main(String[] args) {
		System.out.println("�ǳ�?");
		
		MyPageDAO dao = new MyPageDAOImpl();
		
		MyPageVO member = new MyPageVO();
		
		member.setID("a123123");
		member.setPW("a456456");
		member.setName("�質��");
		member.setBirth("950120");
		
//		Scanner scan = new Scanner(System.in);
//		scan.next();
		dao.signUpMember(member);
		
//		scan.close();
		
	}

}
