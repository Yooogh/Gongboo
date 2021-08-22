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
			//포인터 위치가 마지막에 가있음
			for(int i=0; i<score.length; i++) {
				raf.writeInt(score[i]);
			}
			raf.seek(0);//포인터 위치를 처음으로 바꿔줘야함. 그래야 읽을 수 있음
			while(true) {
				System.out.println(raf.readInt());
			}
		}catch (EOFException eof) {
			//readInt()를 호출했을 때 더이상 읽을 내용이 없으면 발생.
			System.out.println("파일 끝입니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
