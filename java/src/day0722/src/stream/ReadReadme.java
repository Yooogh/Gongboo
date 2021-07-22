package day0722.src.stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadReadme {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader reader = new BufferedReader(
				new FileReader("c:/datas/readme.txt"));
		String str;
		while((str = reader.readLine()) != null) {
			System.out.println(str);
		}
		reader.close();
	}

}
