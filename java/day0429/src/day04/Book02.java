package day04;

public class Book02 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public Book02() {
		this("", "");
		System.out.println("�� �ٸ� ������ Book(String, String) ȣ���");
		//this ������ �������� ù�Ӹ����� �ؾ���. sysout�� ���������� ������. 
	}
	
	public Book02(String title) {
		this(title, "���ڹ̻�");
		System.out.println("Book(String)���� Book(String, String) ������ ȣ���");
	}
	
	public Book02(String title, String author) { 
		this.title =  title; this.author = author;
	}
	
	public static void main(String[] args) {
		Book02 littlePrince = new Book02("�����", "�������丮");
		Book02 loveStory = new Book02("������");
		Book02 emptyBook = new Book02();
		littlePrince.show();
		loveStory.show();
	}
}
