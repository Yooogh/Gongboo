
public class InitTest {
	
	static int cv = 1;
	int iv = 1;
	
	static {
		cv = 2;
		System.out.println("a");
	}
	{	iv = 2;
	System.out.println("b");
	}
	InitTest() {
		System.out.println("c");
		iv = 3;
	}
	public static void main(String[] args) {
		InitTest il = new InitTest();
		System.out.println("cv" + cv);
		System.out.println("il.iv" + il.iv);
	}
}
