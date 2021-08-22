package day06;


class Point {
	private int x, y; //�� ���� �����ϴ� x y ��ǥ
	public void set(int x, int y) { 
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() {
		System.out.println("(" + x + "," + y +")");//���� ��ǥ ���
	}
}


class ColorPoint extends Point {
	private String color;//���� ��
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() { //�÷� ���� ��ǥ ���
		System.out.print(color);
		showPoint(); //PointŬ������ showPoint() ȣ��			
		}
	}


public class ColorPointEx {

	public static void main(String[] args) {
		Point p = new Point(); //Point ��ü ����
		p.set(1, 2); //Point Ŭ������ set() ȣ��
		p.showPoint();
		
		ColorPoint cp = new ColorPoint(); //ColorPoint ��ü
		cp.set(3, 4);//Point �� set() ȣ��
		cp.setColor("red");//ColorPoint�� setColor() ȣ��
		cp.showColorPoint();//�÷��� ��ǥ ���
	}
}
