package day0513;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class IOEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];
		ByteArrayInputStream input = null;
		ByteArrayOutputStream output = null;
		input = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();
		try {
			while(input.available() > 0) {
				int len = input.read(temp);//read()에서 몇개 읽었는지 리턴
				output.write(temp, 0, len); //len(길이만큼)쓴다 ->2개만큼 쓴다
				System.out.println("tme[:"+Arrays.toString(temp));
			}
		
		}catch(IOException e) {}
		outSrc = output.toByteArray();
		
		System.out.println(Arrays.toString(inSrc));
		System.out.println(Arrays.toString(temp));
		System.out.println(Arrays.toString(outSrc));

	}

}
