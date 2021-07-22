package P;

import java.util.Scanner;

class Circle {
	private double x, y;
	private int radius;
	public Circle(double x, double y, int radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
	public double getArea() {
		return radius* radius*3.14;
	}
}

public class CircleManager {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Circle c [] = new Circle[3];
		for(int i=0; i<c.length ; i++) {
			System.out.print("x, y, radius >>");
			double x = sc.nextDouble(); 
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius); //->한줄입력할때마다 배열 입력
		}
//		for(int i=0; i<c.length;i++)
//			c[i].show();
		
		int bigIndex = 0;
		for (int i=0; i<c.length; i++) {
			if(c[bigIndex].getArea()<c[i].getArea())
				bigIndex = i;
		}
		System.out.println("가장 면적이 큰 원은");
		c[bigIndex].show();
		c[bigIndex].getArea();
		sc.close();
	}
}
