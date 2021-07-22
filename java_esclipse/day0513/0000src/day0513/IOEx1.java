package day0513;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null; //����ƮŸ�� �迭
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;//��Ʈ�� Ÿ�� ��ü ���۷��� ����
		input = new ByteArrayInputStream(inSrc);//input ��Ʈ���� ����. ���� ������ �޸� ��(10°��)�� ������ ������ ��Ʈ�� ����.
		output = new ByteArrayOutputStream();
		int data = 0;//������ 0���� ����
		while((data = input.read())!=-1) {//�����Ͱ� ��Ʈ���� �ִ� �����͸� �о��� �� -1�� �ƴϸ�->input�� ������� ������
										  //��������� -1�� ��ȯ��!
			output.write(data);//void write(int b) �����͸� �ƿ�ǲ�� ����. int�� ���� �޾Ƽ� int�� write�� ����.
		}
		outSrc = output.toByteArray(); //
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}
