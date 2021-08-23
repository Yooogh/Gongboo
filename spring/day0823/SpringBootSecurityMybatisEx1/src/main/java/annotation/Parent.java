package annotation;

@SuperAnno
public class Parent {
}

class Child extends Parent{
//Child까지 Parent의 어노테이션 상속받음
}