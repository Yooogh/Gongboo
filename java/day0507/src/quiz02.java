
public class quiz02 {

	public static void main(String[] args) {
		//�ι��� �迭���� ���ϴ� ����..?
		System.out.println(sum(1, 2, 3, 4));
		int arr[]= {2, 3};
		System.out.println(sum(1, arr));
		System.out.println(sum(1, 2, 3, 4, 5));
	}
	public static int sum(int i, int ...j) {//... ����������
		
		int sum2 = 0;
		for (int k : j) {
			sum2 += k;
		}
		return sum2;
	}                                                     
	                 
//	�迭����
//	[]<array �̸��� ��ü�ϴ°�
//	Ÿ������ �迭 ���� ����
//	
}
