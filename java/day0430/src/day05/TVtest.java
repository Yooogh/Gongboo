package day05;

public class TVtest {

	public static void main(String[] args) {
		TVA myTV = new TVA("LG", 2017, 32);
		myTV.show();
	}
}

class TVA {
	String manufacturer;
	int year;
	int size;

	public TVA(String manufacturer, int year, int size) {
		super();
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}

	void show() {
		System.out.println(manufacturer + "���� ���� " + year + "���� " + size + "��ġ");
	}
}