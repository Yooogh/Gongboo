package designPattern;

public class TestString {

    public static void main(String[] args) {
        {
            String s1 = "ghgh";
        } //코드블럭을 만나면 변수들이 자동으로 소멸.
        //하지만 "ghgh"는 삭제되지 않음
        //가비지컬렉터의 처리 대상이 됨
        char[] chs = new char[] {'g', 'h', 'g', 'h'};
        String s2 = new String(chs);

        String s3 = new String("ghgh");
        String s4 = new String("ghgh");
        //new를 쓰면 메모리를 무조건 새롭게 할당함
        //s1 s3 s4는 다른 메모리 사용
        {
            String s5 = "ghgh";
            String s6 = "ghgh";
            //코드블럭 없을 때 : 평범하게 String 초기화하면 새로 만들지 않고 가비지컬렉터가 주워서 버리지 전인 s1과 같은 주소를 참조하게 함

            s5 += "씨";
            //s5가 ghgh + 씨 가 돼버려서 s6과 다른 위치 참조하게 됨
            System.out.println(s5);
            System.out.println(s6);
            //다르게 출력

            s5 += " 안녕하세요";
            //ghgh씨는 참조하는 변수가 없으므로 가비지컬렉터의 대상이 됨
            //컬렉션으로 위치 옮겨감. 아직 삭제 전.
            System.out.println(s5);

            s5.replace('씨', '님');
            //replace는 바뀌는 게 아니고 새로운 캐릭터를 가지고 값을 새롭게 만들어서 넘겨줌
//          //갱신되는게 아님! 참조할 주소 위치가 새로 생겼을거임
            System.out.println(s5);

            s5 = s5.replace('씨', '님');
            //이제 값을 넣어줘서 값이 갱신됨
            System.out.println(s5);
            //갱신을 하고 싶으면 StringBuilder나 StringBuffer를 사용
        }
    }
}
