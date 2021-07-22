package day05;

public class Rectangle {
	private int x;
	private int y;
	private int	width;
	private int height;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int x, int y, int width, int height) {
		super();
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	public void show() {
		System.out.println("("+x+","+y+")"+"���� ũŰ�� "+width +"x"+height+"�� �簢��");
	}
	public int square() {
		return width*height;
	}
	public boolean contains(Rectangle r) {
		if(this.x<r.x && this.y<r.y
				&& this.x+width > r.x+r.width
				&& this.y+height > r.y+r.height)
		return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Rectangle r = new Rectangle(2, 2, 8, 7);
		Rectangle s = new Rectangle(5, 5, 6, 6);
		Rectangle t = new Rectangle(1, 1, 10, 10);
		r.show();
		System.out.println("s�� ������ " + s.square());
		if(t.contains(r)) System.out.println("t�� r�� �����մϴ�");
		if(t.contains(s)) System.out.println("t�� s�� �����մϴ�");
	}

}
