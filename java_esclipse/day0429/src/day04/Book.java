package day04;

public class Book {
	String title;
	String author;
	
	public Book(String t) { //������ 1
		title = t; author = "���ڹ̻�";
	}
	
	public Book(String t, String a) { //������ 2
		title = t; author = a;
	}

	public static void main(String[] args) {
		Book littlePrince = new Book("�����", "�������丮"); //������Book(String t, String a) ȣ��
		Book loveStory = new Book("������"); //������Book(String t) ȣ��
		//Book jungsuk = new Book(); ������. �����ڸ� �ϳ��� ��������� ����Ʈ�� ��������� ����.
		System.out.println(littlePrince.title + " " + littlePrince.author);
		System.out.println(loveStory.title + " " + loveStory.author);
	}
}