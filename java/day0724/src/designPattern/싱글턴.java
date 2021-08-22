package designPattern;

public class 싱글턴 {
    private static 싱글턴 instance참조변수;
    private 싱글턴() {
        //외부에서 만들어 쓸 수 없는 private
        System.out.println(this + "이 위치에 인스턴스 생성됨");
    }
    //모두접근가능 어디서나접근가능(static아니면 객체만들어서 접근해야하는데 인스턴스 못 만드는상태) 자기자신리턴
    public static 싱글턴 getInstance(){
//        if(this == null) {
//        //this는 클래스의 모든 것이 아니고 이 인스턴스를 호출한 인스턴스의 주소. 즉 인스턴스와 상관없는 변수인 this는 static에서 호출할 수 없음
//        }
        if (instance참조변수 == null) {
            instance참조변수 = new 싱글턴();
        }
        return instance참조변수;
    }
    public void output(){
        System.out.println("이 메서드를 호출한 인스턴스의 주소:" + this + "output() ~");
    }
}
