package day0513;
import java.io.*;
public class RandomAccessFileEx3 {

	public static void main(String[] args) {
		int sum = 0;
		
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "r");
			int i=4;
			
			while(true) {//������� ���Ͽ�....
				raf.seek(i);
				sum += raf.readInt();
				i += 16;//�������� ���� 16�� �������Ѱ��鼭 readInt()ȣ��
			}
			
		}catch (EOFException e) {
			System.out.println("sum : " + sum);
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
