package day0513;

import java.io.*;
import java.util.*;

public class SequenceInputStreamEx {

	public static void main(String[] args) {
		byte[] arr1 = {0, 1, 2};
		byte[] arr2 = {3, 4, 5};
		byte[] arr3 = {6, 7, 8};
		byte[] outSrc = null;
		
		Vector v = new Vector();
		v.add(new ByteArrayInputStream(arr1));
		v.add(new ByteArrayInputStream(arr2));
		v.add(new ByteArrayInputStream(arr3));
		
		SequenceInputStream input = new SequenceInputStream(v.elements());
		//input스트림에서 아웃풋 스트림으로 바로 보냄
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		
		int data = 0;
		
		try {
			while((data = input.read())!=-1) {
				output.write(data);//아웃풋을 씀
			}
		}catch (IOException e) {}
		
		outSrc = output.toByteArray();//아웃Src로 보냄
		//보낸걸 출력
		System.out.println("Input Source1 :"+Arrays.toString(arr1));
		System.out.println("Input Source2 :"+Arrays.toString(arr2));
		System.out.println("Input Source3 :"+Arrays.toString(arr3));
		System.out.println("Output Source :"+Arrays.toString(outSrc));	//전체스트림에 보낸거

	}
}
