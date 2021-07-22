package day0513;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);//������ ī�ǿ� ������ ���� ���� ����
			
			int data =0;
			
			while((data=fis.read())!=-1) { //-1�� �ɶ�����. -1�� end of file��
				fos.write(data); //void wirte(int b) read�޼ҵ��� Ÿ���� int�ϱ�
			}//����ƮŸ������ ���� ������ ó���� int Ÿ������ �ϴ� ��
			
			fis.close();//�� ������ -1 ������ Ŭ����
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
