package day0513;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx1 {

	public static void main(String[] args) {
		byte[] inSrc = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] outSrc = null; //바이트타입 배열
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;//스트림 타입 객체 레퍼런스 만듦
		input = new ByteArrayInputStream(inSrc);//input 스트림을 만듦. 읽을 내용이 메모리 상(10째줄)에 있으니 변수에 스트림 꽂음.
		output = new ByteArrayOutputStream();
		int data = 0;//데이터 0으로 세팅
		while((data = input.read())!=-1) {//데이터가 스트림에 있는 데이터를 읽었을 때 -1이 아니면->input이 비어있지 않으면
										  //비어있으면 -1이 반환됨!
			output.write(data);//void write(int b) 데이터를 아웃풋에 넣음. int로 리턴 받아서 int로 write에 넣음.
		}
		outSrc = output.toByteArray(); //
		System.out.println("Input Source :" + Arrays.toString(inSrc));
		System.out.println("Output Source :" + Arrays.toString(outSrc));
	}
}
