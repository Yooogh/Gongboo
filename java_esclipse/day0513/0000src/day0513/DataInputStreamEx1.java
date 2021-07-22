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
			//파일에 있는 입력이랑 출력이랑 다른데,,, 스트링단위라서 그대로 안나옴...
			//각 자료형의 크기가 다르므로 출력할 때랑 입력할 때랑 순서에 주의하기
			//->정수, 실수가 그대로 안나옴->바이트단위로 처리해서!
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
