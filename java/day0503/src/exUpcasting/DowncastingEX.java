package exUpcasting;

public class DowncastingEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person P = new Student("�̼���");
		Student s;
		s = (Student)P;
		System.out.println(s.name);
		s.grade = "A";

	}

}
