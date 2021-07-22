package day0722.useClassTest;

import day0722.classTest.Duke;
import day0722.classTest.SubClassTest;
import day0722.classTest.SubSubTest;

public class Use {
    public static void main(String[] args) {
//        정적 바인딩
        SubClassTest ref2 = new SubSubTest();
        ref2.methodName2();
        //protected여도 인스턴스에 따라 다른 패키지에 있는 데도 호출이 됨

//        ref2 = new Duke();
//        ref2.methodName2();
    }
}
