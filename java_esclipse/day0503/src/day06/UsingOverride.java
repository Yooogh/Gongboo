package day06;
public class UsingOverride {

	public static void main(String[] args) {
		Shape start, last, obj;
		//��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		
		start = new Line(); // Line ��ü ����
		last = start;// ->last�� Line()�� ������
		
		obj = new Rect();
		last.next = obj; //Rect ��ü ���� ->last.next�� obj�� ��
		last = obj;      // ->last�� Rect�� ����
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle(); //Circle ��ü ����
		last.next = obj;
		//��� ���� ���
		
		Shape p = start;
		while(p != null) { //'p�� �����ϴ� ��ü�� ������' �̶�� ��
			p.draw();
			p = p.next;//�ȿ� �ִ� ���� p.next�� �ٲ��
			//p�� ������ �����ϴ� ������ ��ĭ�� �̵�
			//line-> rect->line-circle�� draw()�� ����
		}
	}

}
