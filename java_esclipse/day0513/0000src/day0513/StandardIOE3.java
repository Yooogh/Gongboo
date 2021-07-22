package day0513;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class StandardIOE3 {

	public static void main(String[] args) {
		PrintStream ps =null;
		FileOutputStream fos = null;
		
		try {
			fos =new FileOutputStream ("test.txt");
			ps =new PrintStream(fos);
			System.setOut(ps);
		}catch(FileNotFoundException e) {
			System.err.println("파일 못 찾게썽");
		}
		System.out.println("Hello by System.out");
		System.out.println("Hello by System.err");

	}

}
