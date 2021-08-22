
public class ArrayEx7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] hex = {'C', 'A', 'F', 'E'};
		
		String[] binary = {  "0000","0001","0010","0011"
							,"0100","0101","0110","0111"
							,"1000","1001","1010","1011"
							,"1100","1101","1110","1111"};
		
		String result="";
		
		for(int i=0;i<hex.length;i++) {
			if(hex[i]>='0' && hex[i]<='9'){//문자열에 대한 이진 값을 던져주고 싶음(문자 0부터 F까지만)
				result +=binary[hex[i] = '0']; //'8'-'0'의 값은 8이다
				//문자열에 대한 16진값이 왔을 때 이진으로
		} else {
			result +=binary[hex[i]-'A'+10]+"_"; //'C'-'A'의 결과는 2
			}
		}
		System.out.println("hex: "+new String(hex));//String(char[] value)
		System.out.println("binary: "+result);
	}
}
//헥스라는 문자열에 대한 이진값으로 이진수로 변환함
//binary 배열이 이진수를 순서대로 입력했음
