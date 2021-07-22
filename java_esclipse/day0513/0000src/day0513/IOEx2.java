package day0513;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[10];
		
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;//어떻게 작동하는지
		
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		
		input.read(temp, 0, temp.length);
		output.write(temp, 5, 5);
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(outSrc));

	}

}
