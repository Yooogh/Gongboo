package designPattern;

import java.util.Date;

public class CallBy {
    //String 클래스는 Call By Value다!
    //계속 문자를 조작할 때는, Call By Reference로 조작하려면 Builder, buffer 사용
    public void me1(Date d) {
        d.setYear(2025-1900);
    }

    public void me2(int a) {
        a = 2025;
    }

    public static void main(String[] args) {
        Date today = new Date(); //현재 시스템 날짜 가져옴.
        System.out.println(today);//Date는 toString을 오버라이딩해놨음

        int a = 20;

        CallBy ref = new CallBy();
        ref.me1(today);
        System.out.println("ref.me1(today); 후 -> " + today);

        System.out.println(a);
        ref.me2(a);
        System.out.println("ref.me2(a); 후 ->" + a);
    }
}
