
public class quiz02 {

	public static void main(String[] args) {
		//두번빼 배열부터 더하는 거임..?
		System.out.println(sum(1, 2, 3, 4));
		int arr[]= {2, 3};
		System.out.println(sum(1, arr));
		System.out.println(sum(1, 2, 3, 4, 5));
	}
	public static int sum(int i, int ...j) {//... 가변형인자
		
		int sum2 = 0;
		for (int k : j) {
			sum2 += k;
		}
		return sum2;
	}                                                     
	                 
//	배열에서
//	[]<array 이름을 대체하는거
//	타입으로 배열 방을 만듦
//	
}
