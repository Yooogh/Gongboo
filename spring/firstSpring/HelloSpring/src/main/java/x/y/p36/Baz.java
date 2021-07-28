package x.y.p36;

public class Baz {
	public Baz() {
		System.out.println("Baz 클래스의 인스턴스 생성 위치(주소)" + Integer.toHexString(hashCode()));
		System.out.println(getClass().getName());
	}
	
	public void methodBaz() {
		System.out.println("methodBaz()");
	}
}
