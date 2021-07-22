package day0513;
import java.io.*;
import java.util.Arrays;
public class DataOutputStreamEx2 {

	public static void main(String[] args) {
		ByteArrayOutputStream bos = null;
		DataOutputStream dos = null;
		
		byte[] result = null;
		
		try {
			bos = new ByteArrayOutputStream();
			dos = new DataOutputStream(bos);
			dos.writeInt(10);
			dos.writeFloat(20.0f);
			dos.writeBoolean(true);
			
			result = bos.toByteArray();
			
			String[] hex = new String[result.length];
			
			for(int i=0; i<result.length; i++) {
				if(result[i] <0) {
					hex[i] = String.format("%02x", result[i]+256);
				}else {
					hex[i] = String.format("%02x", result[i]);
				}//이렇게 연산이 문제가 아님 인코딩해야함 ->3번예제로 가세요
			}
			System.out.println("10진수:"+Arrays.toString(result));
			System.out.println("16진수:"+Arrays.toString(hex));
			
			dos.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
