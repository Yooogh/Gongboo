package generics;

public class BoxUse {

    public void someMethod(Box<Number> n) {
//        Box 클래스의 엘리먼트 타입이 Number라는 뜻으로,
//        파생된 게 올 수 있다는 게 아니고
    }
    public void someMethod(Number n) {
//        매개변수 타입은 Number로부터 파생된 서브클래스가 다 올 수 있음
    }
    public void someMethod2(Box<? extends Number> n) {

    }

    public static void main(String[] args) {
        Number n = new Integer(10);
        Number n2 = new Double(10.1);

        Box<Number> box = new Box<Number>();
        box.add(new Integer(10));

        BoxUse ref = new BoxUse();
        ref.someMethod(new Box<Number>());
//        ref.someMethod(new Box<Integer>());
        //에러 남. 이 아규먼트가 들어갈 수 없다
        //사유: 슈퍼타입도 서브타입도 아니므로
        //제네릭 클래스나 인터페이스를 상속관계로 정의하려 다형성적으로 사용하려면
        //와일드 카드 사용해야 함 : ? 기호
        //Number로부터 파생된 것만 들어갈 수 있음
        ref.someMethod2(new Box<Integer>());

    }
}
