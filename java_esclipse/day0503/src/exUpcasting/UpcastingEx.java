package exUpcasting;

class Person {
	String name;
	String id;
	
	public Person(String name) {
		this.name = name;
	}
	public void eat(String menu) {
		System.out.println(menu + "�� �ֹ�");
	}
}

class Student extends Person {
	String grade;
	String department;
	
	public Student(String name) {
		super(name);
	}
	public void study(int hour) {
		System.out.println("���� ������ �ð���" + hour + "�Դϴ�.");
	}
}

public class UpcastingEx {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("�̼���");//StudentŸ���� ����ϰ� ��ü�� ����
		p = s; //��ĳ���� : �θ�κ��� �����ؼ� ��ӹ��� ��ü������ ���� �� ����
		
		System.out.println(p.name);
//		p.grade = "A"; //pŸ���� �θ� ������ �� ������ ������� �� �ֱ� ������
//		p.department = "Com"; //��ӹ��� �ʵ� �߿� ����
		s.grade = "A";
		s.department = "Com";//s�� ������ ������ �Ͼ�� ����
//		�밳 �޼ҵ��� ���ڷ� ���� �� �߻�
		
		p.eat("����");
		s.study(5);
	}
}
