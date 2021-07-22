
public class ThreadEx4 {
	static long startTime = 0;

	public static void main(String[] args) {
		ThreadEx4_1 th1 = new ThreadEx4_1();
		th1.start();
		startTime = System.currentTimeMillis();
		
		for(int i=0;i<300;i++)
			System.out.printf("%s", new String("ㅡ"));
		System.out.println("소요시간1:"+(System.currentTimeMillis() - ThreadEx4.startTime));
	}
}
		class ThreadEx4_1 extends Thread {
			public void run() {
				for(int i=0;i<300;i++)
					System.out.printf("%s",new String("ㅣ"));
				System.out.println("소요시간2:"+(System.currentTimeMillis() - ThreadEx4.startTime));

	}
}
