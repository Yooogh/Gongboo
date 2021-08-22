package day0513;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);//파일의 카피에 꽂으면 없던 파일 생김
			
			int data =0;
			
			while((data=fis.read())!=-1) { //-1이 될때까지. -1이 end of file임
				fos.write(data); //void wirte(int b) read메소드의 타입이 int니까
			}//바이트타입으로 쓰고 읽지만 처리는 int 타입으로 하는 중
			
			fis.close();//다 끝나서 -1 만나면 클로즈
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
