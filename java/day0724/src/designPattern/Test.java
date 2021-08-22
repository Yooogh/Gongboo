package designPattern;

import java.util.Calendar;

public class Test {
    public static void main(String[] args) {
//        싱글턴 ref = new 싱글턴(); //못만듦!
//        ref.output(); //못씀!

//        Calendar today = Calendar.getInstance();//new Calendar();
        //인스턴스를 못 만들지만 인스턴스를 만들 수 있게 메서드가 준비돼있음

        싱글턴 ref2 = 싱글턴.getInstance();
        ref2.output();
        싱글턴 ref3 = 싱글턴.getInstance();
        ref2.output();
        싱글턴 ref4 = 싱글턴.getInstance();
        ref2.output();

        //생성자인 private 싱글턴()은 한번만 호출되고 output은 세번 호출됨
        //한번 만들어진 인스턴스로 재사용
        //이런 식으로 쓰면 객체를 매번 생성하지 않고 메소드 실행하는 것만 함
        //인스턴스 생성이 쌓이면 순간 멈춤. 생성, 소멸 순간에 멈추기 때문에...
    }
}
