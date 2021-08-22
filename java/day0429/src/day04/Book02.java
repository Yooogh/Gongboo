package day04;

public class Book02 {
	String title;
	String author;
	void show() { System.out.println(title + " " + author); }
	
	public Book02() {
		this("", "");
		System.out.println("또 다른 생성자 Book(String, String) 호출됨");
		//this 선언은 생성자의 첫머리에서 해야함. sysout이 먼저나가면 오류남. 
	}
	
	public Book02(String title) {
		this(title, "작자미상");
		System.out.println("Book(String)에서 Book(String, String) 생성자 호출됨");
	}
	
	public Book02(String title, String author) { 
		this.title =  title; this.author = author;
	}
	
	public static void main(String[] args) {
		Book02 littlePrince = new Book02("어린왕자", "생텍지페리");
		Book02 loveStory = new Book02("춘향전");
		Book02 emptyBook = new Book02();
		littlePrince.show();
		loveStory.show();
	}
}
