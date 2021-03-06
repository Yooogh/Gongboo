package generics;

import java.util.ArrayList;
import java.util.List;

public class CodeMapGenericUse {
    public static void main(String[] args) {
        Person p1 = new Person("kim", "kim mal ja", "서울");
        CodeMap<Integer, Person> c1 =
                new CodeMap<Integer, Person>(1, p1);
//        List<Person> list = new ArrayList<>();
        CodeMap<Integer, Person> c2 =
                new CodeMap<Integer, Person>(3, new Person("kim", "kim mal ja","서울"));
        System.out.println(
                CodeMap.valueCompare(c1, c2) ? "데이터가 같은" : "데이터가 다름");
    }
}