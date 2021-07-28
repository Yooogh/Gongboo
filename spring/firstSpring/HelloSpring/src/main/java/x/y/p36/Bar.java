package x.y.p36;

public class Bar {
	public Bar() {
		System.out.println("Bar 클래스의 인스턴스 생성 위치(주소)" + Integer.toHexString(hashCode()));
		System.out.println(this + "    Bar()");
	}
	
	public void 아무거나() {
		System.out.println("***아**무**거**나***");
	}
}
