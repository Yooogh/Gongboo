import java.util.*;
public class VectorEx1 {

	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");//�� ���� ���� size
		print(v);
		//ũ��capacity 5¥�� Vector
		
		v.trimToSize();
		System.out.println("***After trimToSize()***");
		print(v);
		//���� ����
		
		v.ensureCapacity(6);
		System.out.println("***After ensureCapacity***");
		print(v);
		//minCapacity�� �ǵ���
		
		v.setSize(7);
		System.out.println("***After setSize(7)***");
		print(v);
		//size�� 7�� �ǵ���. size�� capacity�� �ٸ�!
		//capacity �����ϹǷ� ���ο� �ν��Ͻ� ����.�ڵ������� ���� ������ 2�谡 ��.
		
		v.clear();
		System.out.println("***After clear()***");
		print(v);
		//��� ��� ����(size 0) capacity �״��.
	}
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size :"+v.size());
		System.out.println("capacity :"+v.capacity());
	}
}
