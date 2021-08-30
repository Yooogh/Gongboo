package day0513;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score = { 1, 100, 90, 90,
						2, 70, 90, 100,
						3, 100, 100, 90,
						4, 70, 60, 80,
						5, 70, 90, 100 };
		int sum = 0;
		try {
			RandomAccessFile raf = new RandomAccessFile("score2.dat", "rw");
			//������ ��ġ�� �������� ������
			for(int i=0; i<score.length; i++) {
				raf.writeInt(score[i]);
			}
			raf.seek(0);//������ ��ġ�� ó������ �ٲ������. �׷��� ���� �� ����
			while(true) {
				System.out.println(raf.readInt());
			}
		}catch (EOFException eof) {
			//readInt()�� ȣ������ �� ���̻� ���� ������ ������ �߻�.
			System.out.println("���� ���Դϴ�.");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}