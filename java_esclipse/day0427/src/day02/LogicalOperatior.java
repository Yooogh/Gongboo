package day02;

public class LogicalOperatior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println('a' > 'b');//�����ڵ� ���� ũ�� ��
		System.out.println(3 >= 2);
		System.out.println(-1 < 0);
		System.out.println(3.45 <= 2);
		System.out.println(3 == 2);
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		
		//�� ����� �� ���� ����
		System.out.println((3 > 2) && (3> 4));
		System.out.println((3 != 2) || (-1 > 0));
		//�ʼ�Ŷ. ���� �����̸� �ڸ� �������� �ʰ� ���� �ٷ� �Ѿ. �ϳ��� ���̶� �ӵ��� ���̰� ��
		System.out.println((3 != 2) | (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));
	}
}