
public class StringEx2 {
	public static void main(String args[]) {
		String s1 = "AAA";
		String s2 = "AAA";
		String s3 = new String("AAA");
		
		System.out.println(s1==s2); //���� ����
		System.out.println(s2==s3); //���� ����, s3 ��ü ����
		System.out.println(s1.equals(s2)); //���� ����
		System.out.println(s1.equals(s3)); //���� ����, s3 ��ü ����
		/* ��Ʈ�� Ŭ������ new Ŭ������ ���ͷ������� ������� �Ŷ� ���̰� ����
		 * ��� ������ ������ؼ� �������,
		 * ���ο� ���ڿ��� ����� JVM�� ��� Ǯ�� ������ ���� ����� ������ �� ���� ������ ��.
		 */
	}
}
