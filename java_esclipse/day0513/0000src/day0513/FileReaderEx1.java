package day0513;
import java.io.*;
public class FileReaderEx1 {

	public static void main(String[] args) {
		try {
			String fileName = "test.txt";
			FileInputStream fis = new FileInputStream(fileName);
			FileReader fr = new FileReader(fileName);
			int data = 0;
			while((data=fis.read())!=-1) {
				System.out.print((char)data);//형변환 한 경우
			}
			System.out.println();
			fis.close();
			while((data=fr.read())!=-1) {
				System.out.print(data);//형변환 안한 경우
			}
			System.out.println();
			fr.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
