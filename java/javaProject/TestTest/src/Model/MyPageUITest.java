package Model;

import java.util.Scanner;

public class MyPageUITest {
//crud create read update delete
	
	public MyPageUITest() {
		//기본 생성자
	}
	
	//<DB접속>
	//getConn()
	//String url, user, pw = ""
	//JDBC 드라이버 로드
	//오라클DBMS에 연결해 커넥션 객체 얻기
	
	
	//변수 선언
	static String ID ="yooogh";
	static String PW ="yoyoyoyo";
	static String name ="유경혜";
	static String birth = "1995.01.20";//타입 바꿔
	
	String title;
	String date;
	String plex;
	String seat;
	
	static Scanner sc = new Scanner(System.in);
	
	//메서드 정리
	//메뉴 선택
	public static void menuMyPage() {
		System.out.println("====마이 페이지====");
		System.out.println("▶ 내 정보 보기 : (1)");
		System.out.println("▶ 예매 확인 : (2)");
		System.out.println("-----------------");
		System.out.print("메뉴를 입력하세요 : ");
		
//		boolean flag = false;
//		for(;;) {
//			String m = sc.next();
//			switch (m) {
//				case "1" : //내 정보 보기 화면 출력
//					viewMember();
//					break;
//				case "2" : //예매 확인 화면 출력
//					viewReserve();
//					flag = true;
//					break;
//				default :
//					System.out.println("잘못 입력하였습니다.");
//					break;
//			}
//			if(flag == true) {
//				System.out.println("다시 선택하십시오");
//				break;
//			}
//		}
		

		menu: for(;;) {
			String m = sc.next();
			switch (m) {
				case "1" : //내 정보 보기 화면 출력
					viewMember();
					break menu;
				case "2" : //예매 확인 화면 출력
					viewReserve();
					break menu;
				default :
					System.out.print("잘못 입력하였습니다. 다시 선택하세요.");
					break;
			}
		}	
	}
	
	//회원 정보 조회
	public static void viewMember() {
		
		//DB접속
//		conn = getConn();
		//sql 문장 작성
//		String sql = "SELECT ID, NAME, BIRTH FROM MEMBER = ?" ???????
		
		
		System.out.println("=====내 정보=====");
		System.out.println("▶ ID : " + ID);  //쿼리.getString("id")
		System.out.println("▶ 이름 : " + name);
		System.out.println("▶ 생일 : " + birth);
		System.out.println("-----------------");
		System.out.println("내 정보를 수정하시려면 1번, 메뉴로 돌아가시려면 2번을 입력하세요");

		
		switch (sc.next()) {
		case "1" : //내 정보 보기 화면 출력
			modifyMember();
			break;
		case "2" : //예매 확인 화면 출력
			menuMyPage();
			break;
		}
		System.out.println();

		
	}
	
	public static void modifyMember() {
		System.out.println("===회원 정보 수정===");
		System.out.println("▶ 비밀번호 변경 : 1");
		System.out.println("▶ 이름 변경 : 2");
		System.out.println("▶ 생일 변경 : 3");
		System.out.println("- - - - - - - - -");
		System.out.println("▶ 회원 탈퇴 : 4");
		System.out.println("-----------------");
		System.out.println("원하시는 항목의 번호를 입력하세요");
		System.out.println("-----------------");

		switch (sc.next()) {
		case "P" : 
//			modPW(); 
//-> 비밀번호 일치하면
//-> 변경할 비밀번호를 입력하라는 창 뜨고
//-> 입력한 비밀번호로 비번값 교체됨
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
	
	//회원 정보 삭제(탈퇴)
	public static void delMember() {
		System.out.println("=====회원 탈퇴=====");
		System.out.println("탈퇴하시겠습니까?");
		System.out.println("탈퇴하시려면 비밀번호를 입력하세요. 메인으로 돌아가려면 1을 입력하세요");
		System.out.print("▶ 비밀번호 입력 : ");
		//비밀번호 입력
		Scanner sc = new Scanner(System.in);
		String inputPW = null;
		inputPW = sc.nextLine();

		//입력한 비밀번호가 DB의 비번과 일치하는지 확인
		//1 누르면 메인으로 가는 조건문 필요
		if(!inputPW.equals(PW)) {
			System.out.println("잘못된 비밀번호입니다.");
			//->이 다음 회원탈퇴 화면으로 다시 돌아감
			//->회원탈퇴 화면에서는 메인으로 돌아가는 버튼 필요
		} else {
			System.out.println("탈퇴되었습니다.");
		}
		System.out.println();
	}
	

	//예매 내역 조회 --> viewMember()에서 2 입력 시
	public static void viewReserve() {
		System.out.println("=== 예매 내역 조회 ===");
		System.out.println("whyrano");
		System.out.println("-----------------");
		System.out.println("마이페이지 메뉴로 돌아가시려면 1, 예매취소를 원하면 2");
		
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
	
	//예매 취소
	public static void delReserve() {
		System.out.println("=== 예매 취소 ===");
		System.out.println("예매를 취소하시겠습니까?");
		System.out.println("-----------------");

	}
	
	
	public static void getMemberPW() {  //comparePW 패스워드 비교?
/*
 * String beforePW = sql에서 getString()한 값
 * ->비밀번호 검색
 * String sql = "select member_pw from member where member_id = ?";
 * String member_pw = null;
 * try-catch
 * return member_pw
 * 
 * String afterPW = sc.next();
 * 
 * boolean e = afterPW.equals(beforePW)
 * if (e = true) {
 * syso 변경할 비밀번호를 입력하시오.
 * 비밀번호 변경 메소드
 * }
 */
		
	}
	public static void modifyPW() {
		
	}



}
