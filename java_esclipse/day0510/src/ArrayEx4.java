
public class ArrayEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] abc = {'A', 'B', 'C', 'D'};
		char[] num = {'0','1','2','3','4','5','6','7','8','9'};
		System.out.println(abc);
		System.out.println(num);
		
		//배열 abc+num 합치기
		char[] result = new char[abc.length + num.length];
		System.arraycopy(abc, 0, result, 0, abc.length);
		System.arraycopy(num, 0, result, abc.length, num.length);
		System.out.println(result);
		
		//abc를 num의 첫번째 위치부터 배열 abc 길이만큼 복사
		System.arraycopy(abc, 0, num, 0, abc.length);
		System.out.println(num);
		
		//num의 인덱스6 위치에 3개 복사
		System.arraycopy(abc, 0, num, 6, 3);
		System.out.println(num);
		}
	}
