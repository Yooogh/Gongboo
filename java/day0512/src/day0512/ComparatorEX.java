package day0512;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strArr = {"cat", "Dog", "lion", "tiger"};
		Arrays.sort(strArr);//String�� Comparable������ ���� ����
		System.out.println("strArr="+Arrays.toString(strArr));
		//��ҹ��� ������ ���� �ڵ� ������ ����
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);//��ҹ��� ����X
		System.out.println("strArr="+Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());//��������
		System.out.println("strArr="+Arrays.toString(strArr));
	}

}
//�������� ����
class Descending implements Comparator { //Comparator�� �����ؾ� ��!
	public int compare(Object o1, Object o2) {//o1, o2�� ����
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable���� Ȯ��
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2)*-1; //-1�� ���ϰų� c2.compareTo(c1)ó�� ������ �ٲ㵵 ��.
		}//compareto�� �ڱ� �ڽŰ� ���޹��� ��ü�� ����.
		return -1;//if���� ������� �ʴ´� = o1, o2�� Comparable���� �ʴٴ� ��
	}
	//���������϶� ->��ȣ�� �ٲٸ� ������������ �ٲ�!
	//�� ���ϴ� �ڸ��� �ٲ㵵 �ٲ�! �Ųٷ� ���ϴϱ�
}