package x.y.p36;

public class P36Use {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bar bar = new Bar();
		Baz baz = new Baz();
		Foo foo = new Foo(bar, baz);
		
		Bar bar2 = new Bar();
		Baz baz2 = new Baz();
		Foo foo2 = new Foo(bar2, baz2);
	}

}
