package sample;

import java.awt.List;

public class Test1 extends Object{
	
	public static void main(String[] args) {
		
		//�����ε� : �ϳ��� Ŭ���� �ȿ� ������ �޼��� �غ�. �Ű������� ���� ����� �ٸ��� ���
		System.out.println();
		
		//variable arguments : varage(?)
		System.out.printf(null, args);
		
		//�������� ġȯ�� ��Ģ
		List list = new ArrayList();
		list.add("aaa"); //add�� list�� ���� ����
		//�ٵ� ArrayList �ȿ� ����
		//�Ǥ� ��ó�� ��ü�� ArrayList�̹Ƿ� AL�� �ִ� add�� ����ϴ� ����
		
		
	}

	//�������̵�, ������
	@Override
	public String toString() {
		//Object Ŭ������ toString(����ڵ� ������)
		//getClass().getName() + '@' + Integer.toHexString(hashCode())
		//�� �������� �ٸ� ������ ����
		//�Ű������� �ٸ��� ������(ex. int a) ������̼��� ���� �ʰڳİ� ���
		return "Test1 []";
	}
	
	

}
