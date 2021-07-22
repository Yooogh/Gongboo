package day0513;
import java.io.*;
public class RandomAccessFileEx3 {

	public static void main(String[] args) {
		int sum = 0;
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i=4;
			
			while(true) {//국어성적에 대하여....
				raf.seek(i);
				sum += raf.readInt();
				i += 16;//포인터의 값을 16씩 증가시켜가면서 readInt()호출
			}
			
		}catch (EOFException e) {
			System.out.println("sum : " + sum);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
