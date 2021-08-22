import java.awt.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class StringMethodUse {

    public static void main(String[] args) {

        String str1 = "abc:df:rrr:uuu";
        String str2 = "강남구 역삼동 123-1";
        String str3 = "<html blahblah>";
        String kim1 = "kim";
        String kim2 = "KIM";
        String kim3 = "KiM";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";

        //1. 구분자 기준으로 나누기
        String[] str1Cut = str1.split(":");
        System.out.println(Arrays.toString(str1Cut));
//        ----------------
        String []str1s =  url.split(":");
        System.out.println(str1s.length);

        for( int i =0 ; i<  str1s.length  ;  i++) {
            System.out.println(i+"번째 데이터 "+ str1s[i]);
        }

//        split 없던 시절...
        StringTokenizer tokenizer = new StringTokenizer(url,":");
        int count = tokenizer.countTokens();
        String [] str1Arr = new String[count];
        int i =0;

        while(tokenizer.hasMoreTokens()) {
            str1Arr[i++] = tokenizer.nextToken();
        }

        for( int i2 =0 ; i2<  str1Arr.length  ;  i2++) {
            System.out.println(i2+"번째 데이터 "+ str1Arr[i2]);
        }


        //2. f 인덱스 찾기
        int str1Index = str1.indexOf("f");
        System.out.println("f의 위치 : [" + str1Index +"]");
//        ----------------
        int index = url.indexOf('@');
        System.out.println(index);


        //3. f 뒷부분 받아오기
        String str1CutF = str1.substring(str1Index+1);
        System.out.println(str1CutF);
//        ----------------
        //@다음 문자 리턴
        String returnNewString = url.substring(index+1);
        System.out.println(returnNewString);
        //중간에 있는 글자 리턴
        int urlLength = url.length();
        returnNewString = url.substring(index+1, urlLength-3);
        System.out.println(returnNewString);


        //4. 역삼동 있는지 확인
        boolean str2YS = str2.contains("역삼동");
        System.out.println(str2YS);
//        ----------------
        System.out.println(url.contains("oracle"));


        //5. 처음 시작이 <인지 확인
        boolean str3Start = str3.startsWith("<");
        System.out.println(str3Start);
//        ----------------
        if(str3Start) {
            str3 = str3.replace('<', ' ');
        }
        System.out.println(str3);


        //6. 대소문자 무시 비교
        System.out.println(kim1.equalsIgnoreCase(kim2));
        System.out.println(kim1.equalsIgnoreCase(kim3));
        System.out.println(kim2.equalsIgnoreCase(kim3));
//        ----------------
        if(kim1.equalsIgnoreCase(kim2)) {
            System.out.println("같은 데이터");
        } else {
            System.out.println("서로 다른 데이터");
        }
        //소문자로 변경
        if(kim1.equals(kim2.toLowerCase())) {
            System.out.println("같은 데이터");
        } else {
            System.out.println("서로 다른 데이터");
        }

        //trim
        //charAt
        //isEmpty
        String emp1;
        String emp2 = "";
        String emp3 = null;
        //empty : 인스턴스는 있지만 구성하는 것이 없을 때

        //인스턴스를 스트링으로 줬는데 내용이 없는 것 => empty
        //null은 변수 공간은 있는데 참조하는 게 없는 것
        System.out.println(emp2.isEmpty());
        System.out.println(emp3.isEmpty());
    }


}
