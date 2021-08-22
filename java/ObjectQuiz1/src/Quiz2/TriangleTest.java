package Quiz2;

class Triangle {
	//�Ӽ�
	private double height;
	private double length;

	//������
	public Triangle(double height, double length) {
		this.height = height;
		this.length = length;
	}
	//����
	public double getHeight() {
		return height;
	}
	public double getLength() {
		return length;
	}
	//����
	public double findArea() {
		return height * length * 0.5;
	}
	//���� ��
	public boolean isSameArea(Triangle k) {
		if (k.findArea() == findArea() )
			return true;
		 else 
			return false;
	}
}

public class TriangleTest {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		Triangle t3 = new Triangle(8.0, 8.0);
		
//		System.out.println(t.findArea());
		System.out.println(t1.isSameArea(t1));
		System.out.println(t1.isSameArea(t2));
		System.out.println(t1.isSameArea(t3));
	}
}