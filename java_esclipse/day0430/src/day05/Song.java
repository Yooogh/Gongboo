package day05;

public class Song {
	
	String title;
	String artist;
	int year;
	String country;
	
	public Song() {
		super();
	}

	public Song(String title, String arist, int year, String country) {
		super();
		this.title = title;
		this.artist = arist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.println(year + "�� " +country+ " ������ " + artist + "�� �θ� " + title);
	}

	public static void main(String[] args) {
		Song s1 = new Song("Dancing Queen", "ABBA", 1978, "������");
		s1.show();
		
	}

}
