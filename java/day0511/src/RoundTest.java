import java.util.ArrayList;

public class RoundTest {

	public static void main(String[] args) {
		System.out.println("i="+Integer.parseInt("100"));
		System.out.println("i="+Integer.parseInt("100", 10));
		System.out.println("i="+Integer.parseInt("100", 8));
		System.out.println("i="+Integer.parseInt("100", 2));
		System.out.println("i="+Integer.parseInt("100", 16));
		
		ArrayList<Integer> list = new ArrayList<Integer>(); //��ü�� ���尡���� ����Ʈ�ε�
		list.add(new Integer(100));
		list.add(100);
		System.out.println(list);
		
//		Integer i = list.get(0);
//		int i = list.get(0).intValue();
		int i = list.get(0); //�����Ϸ��� ��ȯ���༭ �⺻���� ���� �� �ְ� ��.
		System.out.println(list);
		
	}

}
