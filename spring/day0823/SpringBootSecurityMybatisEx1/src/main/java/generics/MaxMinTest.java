package generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MaxMinTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(1);
        list.add(490);
        list.add(34);

        Iterator<Integer> iterator = list.iterator();
        int  tempI = iterator.next();
        //이렇게 되면 integer타입을 원시 자료형int으로 언박싱됨
        while(iterator.hasNext()) { //다음이 있는지 확인
            //있으면 값을 가져옴
            int nextData = iterator.next();
            if(tempI < nextData)
                tempI = iterator.next();
            System.out.println(tempI);

        }
        System.out.println("~~~~~~~");
        int[] nums = {4, 1, 490, 34};
        int temp = nums[0];
        // 0번째 자리의 값보다 큰 것을 찾는다
        if (temp < nums[1]) temp = nums[1];
//        else temp = temp;
        if (temp < nums[2]) temp = nums[2];
//        else temp = temp;
        if (temp < nums[3]) temp = nums[3];
//        else temp = temp;

        System.out.println("temp =" + temp);
        System.out.println("~~~~~~~");
        temp = nums[0];
        for (int i=1; i < nums.length; i++) {
            if (temp < nums[i]) temp = nums[i];
            System.out.println(temp);
        }
        System.out.println("최종적 temp =" + temp);
    }
}
