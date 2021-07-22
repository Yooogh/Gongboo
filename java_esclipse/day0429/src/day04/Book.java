package day04;

public class Book {
	String title;
	String author;
	
	public Book(String t) { //생성자 1
		title = t; author = "작자미상";
	}
	
	public Book(String t, String a) { //생성자 2
		title = t; author = a;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("어린왕자", "생텍쥐페리"); //생성자Book(String t, String a) 호출
		Book loveStory = new Book("춘향전"); //생성자Book(String t) 호출
		//Book jungsuk = new Book(); 오류남. 생성자를 하나라도 만들었으면 디폴트로 만들어주지 않음.
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}