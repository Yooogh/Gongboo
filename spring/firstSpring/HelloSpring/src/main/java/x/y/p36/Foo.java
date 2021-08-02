package x.y.p36;

public class Foo {
	private Bar bar; //인스턴스 아니고 참조자만 띡 있는 상황
	private Baz baz;
	
	public Foo() {
		super();
		//default Constructor
		//없으면 상속하는 클래스 만들었을 때 에러가 발생함.
	}
	//잠재적인 오류 클래스
	//상속하지 않을 것이라면 final을 붙여야지 디폴트 생성자를 안 만들어서는 안됨
	public Foo(Bar bar, Baz baz) {
		System.out.println("Foo 클래스의 인스턴스 생성 위치(주소)" + Integer.toHexString(hashCode()));
		this.bar = bar;
		this.baz = baz;
		System.out.println("Foo(Bar bar, Baz baz)");
	}
}
