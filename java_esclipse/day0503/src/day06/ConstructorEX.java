package day06;

class A{
	public A() {
		System.out.println("Constructor A");
	}
	public A(int x) {
		System.out.println("Constructor a(int x) ȣ��");
	}
}

class B extends A {
	public B() {
		
		System.out.println("Constructor B()");
	}
	public B(int y) {
		System.out.println("Constructor B(int y) ȣ��");
	}
}

class C extends B {
	public C() {
		System.out.println("Constructor C");
	}
}

public class ConstructorEX {

	public static void main(String[] args) {
		B b = new B(5);
	}
}
