package day0513;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamEx1 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("sample.dat");
			DataInputStream dis = new DataInputStream(fis);
			
			System.out.println(dis.readInt());
			System.out.println(dis.readFloat());
			System.out.println(dis.readBoolean());
			dis.close();
			//���Ͽ� �ִ� �Է��̶� ����̶� �ٸ���,,, ��Ʈ�������� �״�� �ȳ���...
			//�� �ڷ����� ũ�Ⱑ �ٸ��Ƿ� ����� ���� �Է��� ���� ������ �����ϱ�
			//->����, �Ǽ��� �״�� �ȳ���->����Ʈ������ ó���ؼ�!
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
