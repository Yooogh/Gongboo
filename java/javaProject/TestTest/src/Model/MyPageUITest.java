package Model;

import java.util.Scanner;

public class MyPageUITest {
//crud create read update delete
	
	public MyPageUITest() {
		//�⺻ ������
	}
	
	//<DB����>
	//getConn()
	//String url, user, pw = ""
	//JDBC ����̹� �ε�
	//����ŬDBMS�� ������ Ŀ�ؼ� ��ü ���
	
	
	//���� ����
	static String ID ="yooogh";
	static String PW ="yoyoyoyo";
	static String name ="������";
	static String birth = "1995.01.20";//Ÿ�� �ٲ�
	
	String title;
	String date;
	String plex;
	String seat;
	
	static Scanner sc = new Scanner(System.in);
	
	//�޼��� ����
	//�޴� ����
	public static void menuMyPage() {
		System.out.println("====���� ������====");
		System.out.println("�� �� ���� ���� : (1)");
		System.out.println("�� ���� Ȯ�� : (2)");
		System.out.println("-----------------");
		System.out.print("�޴��� �Է��ϼ��� : ");
		
//		boolean flag = false;
//		for(;;) {
//			String m = sc.next();
//			switch (m) {
//				case "1" : //�� ���� ���� ȭ�� ���
//					viewMember();
//					break;
//				case "2" : //���� Ȯ�� ȭ�� ���
//					viewReserve();
//					flag = true;
//					break;
//				default :
//					System.out.println("�߸� �Է��Ͽ����ϴ�.");
//					break;
//			}
//			if(flag == true) {
//				System.out.println("�ٽ� �����Ͻʽÿ�");
//				break;
//			}
//		}
		

		menu: for(;;) {
			String m = sc.next();
			switch (m) {
				case "1" : //�� ���� ���� ȭ�� ���
					viewMember();
					break menu;
				case "2" : //���� Ȯ�� ȭ�� ���
					viewReserve();
					break menu;
				default :
					System.out.print("�߸� �Է��Ͽ����ϴ�. �ٽ� �����ϼ���.");
					break;
			}
		}	
	}
	
	//ȸ�� ���� ��ȸ
	public static void viewMember() {
		
		//DB����
//		conn = getConn();
		//sql ���� �ۼ�
//		String sql = "SELECT ID, NAME, BIRTH FROM MEMBER = ?" ???????
		
		
		System.out.println("=====�� ����=====");
		System.out.println("�� ID : " + ID);  //����.getString("id")
		System.out.println("�� �̸� : " + name);
		System.out.println("�� ���� : " + birth);
		System.out.println("-----------------");
		System.out.println("�� ������ �����Ͻ÷��� 1��, �޴��� ���ư��÷��� 2���� �Է��ϼ���");

		
		switch (sc.next()) {
		case "1" : //�� ���� ���� ȭ�� ���
			modifyMember();
			break;
		case "2" : //���� Ȯ�� ȭ�� ���
			menuMyPage();
			break;
		}
		System.out.println();

		
	}
	
	public static void modifyMember() {
		System.out.println("===ȸ�� ���� ����===");
		System.out.println("�� ��й�ȣ ���� : 1");
		System.out.println("�� �̸� ���� : 2");
		System.out.println("�� ���� ���� : 3");
		System.out.println("- - - - - - - - -");
		System.out.println("�� ȸ�� Ż�� : 4");
		System.out.println("-----------------");
		System.out.println("���Ͻô� �׸��� ��ȣ�� �Է��ϼ���");
		System.out.println("-----------------");

		switch (sc.next()) {
		case "P" : 
//			modPW(); 
//-> ��й�ȣ ��ġ�ϸ�
//-> ������ ��й�ȣ�� �Է��϶�� â �߰�
//-> �Է��� ��й�ȣ�� ����� ��ü��
//			break;
		case "N" : 
//			modName();
//			break;
		case "3" : 
//			modBirth();
//			break;
		case "4" : 
			delMember();
			break;
		}
		System.out.println();
	}
	
	//ȸ�� ���� ����(Ż��)
	public static void delMember() {
		System.out.println("=====ȸ�� Ż��=====");
		System.out.println("Ż���Ͻðڽ��ϱ�?");
		System.out.println("Ż���Ͻ÷��� ��й�ȣ�� �Է��ϼ���. �������� ���ư����� 1�� �Է��ϼ���");
		System.out.print("�� ��й�ȣ �Է� : ");
		//��й�ȣ �Է�
		Scanner sc = new Scanner(System.in);
		String inputPW = null;
		inputPW = sc.nextLine();

		//�Է��� ��й�ȣ�� DB�� ����� ��ġ�ϴ��� Ȯ��
		//1 ������ �������� ���� ���ǹ� �ʿ�
		if(!inputPW.equals(PW)) {
			System.out.println("�߸��� ��й�ȣ�Դϴ�.");
			//->�� ���� ȸ��Ż�� ȭ������ �ٽ� ���ư�
			//->ȸ��Ż�� ȭ�鿡���� �������� ���ư��� ��ư �ʿ�
		} else {
			System.out.println("Ż��Ǿ����ϴ�.");
		}
		System.out.println();
	}
	

	//���� ���� ��ȸ --> viewMember()���� 2 �Է� ��
	public static void viewReserve() {
		System.out.println("=== ���� ���� ��ȸ ===");
		System.out.println("whyrano");
		System.out.println("-----------------");
		System.out.println("���������� �޴��� ���ư��÷��� 1, ������Ҹ� ���ϸ� 2");
		
		switch(sc.next()) {
			case "1" :
				menuMyPage();
				break;
			case "2" :
				delReserve();
				break;
		}
		System.out.println();
	}
	
	//���� ���
	public static void delReserve() {
		System.out.println("=== ���� ��� ===");
		System.out.println("���Ÿ� ����Ͻðڽ��ϱ�?");
		System.out.println("-----------------");

	}
	
	
	public static void getMemberPW() {  //comparePW �н����� ��?
/*
 * String beforePW = sql���� getString()�� ��
 * ->��й�ȣ �˻�
 * String sql = "select member_pw from member where member_id = ?";
 * String member_pw = null;
 * try-catch
 * return member_pw
 * 
 * String afterPW = sc.next();
 * 
 * boolean e = afterPW.equals(beforePW)
 * if (e = true) {
 * syso ������ ��й�ȣ�� �Է��Ͻÿ�.
 * ��й�ȣ ���� �޼ҵ�
 * }
 */
		
	}
	public static void modifyPW() {
		
	}



}
