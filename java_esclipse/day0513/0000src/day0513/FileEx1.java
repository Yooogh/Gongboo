package day0513;

import java.io.File;

public class FileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("C:\\Users\\bitcamp\\eclipse-workspace\\day0513\\src\\day0513");
		String fileName = f.getName();
		int pos = fileName.lastIndexOf(".");
		System.out.println();

	}

}
