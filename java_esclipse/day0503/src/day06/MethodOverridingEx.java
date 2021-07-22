package day06;

	class Shape { //���� Ŭ����
		public Shape next;//��ũ�帮��Ʈ ����. ��ũ�ϳ��ϳ��� �����Ͷ�� ������ �ʵ尪���� �����ϴ� ��
		//����� ���� ���� �� �� �ּҸ� �˾ƾ� ��. ��ũ�嵥������ ��� �����Ϳ� ���� �ߺ��� �� �ְ�, ������ ����.
		//next��� ���۷��� ���� ����Ű�� ���� ���� ���. �� Shape �ȿ� next�� �ְ�. �� next�� null�� �ʱ�ȭ.
		public Shape() {next = null;}
		
		public void draw() {
			System.out.println("Shape");
		}
	}
	
	class Line extends Shape {
		public void draw() { //�޼ҵ� �������̵�
			System.out.println("Line");
		}
	}
	
	class Rect extends Shape {
		public void draw() { //�޼ҵ� �������̵�
			System.out.println("Rect");
		}
	}
	
	class Circle extends Shape {
		public void draw() { //�޼ҵ� �������̵�
			System.out.println("Circle");
		}
	}
	
	public class MethodOverridingEx {
	static void paint(Shape p) {//Shape�� ��ӹ��� ��� ��ü���� �Ű����� p�� �Ѿ�� �� ����
		p.draw();//p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��.
				 //���� ���ε�
	}
		
	public static void main(String[] args) {
		Line line = new Line();//��ü line ����
		//���� ȣ����� ��� paint() �޼ҵ� ������ Shape�� ���� ���۷��� p�� ��ĳ���õ�
		paint(line);//print�޼ҵ�-�ڱ� paint �޼ҵ� �ȿ� ����
		//Line�� draw() ����, "Line" ���
		paint(new Shape());//Shape�� 
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}

	