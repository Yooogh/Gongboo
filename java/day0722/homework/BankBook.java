package day0722.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class BankBook {
    protected String custName;
    protected String accountNum;
    protected int period;
    protected double rate;
    protected long interest;
    protected long total;

    protected BufferedReader reader;
    public void baseInput() {
        if(reader == null) {
            reader = new BufferedReader(
                    new InputStreamReader(System.in)
                    // System.in은 InputStream임. 근데 Reader에서 쓰려니 Reader로 변환해줘야 함.
            );
        }//if(reader ==null) true 구문의 종료 부분
        /*
        * 저축, 대출, 적금도 동일하게 받을 자리가 있음
        * 고객이름
        *           입금금액
        * 기간(년단위)*/
        System.out.print("고객이름?");
        try {
            custName = reader.readLine(); //IO니까 throws, 근데 기초클래스에 없는데 exception 선언해버리면 안 됨 -> 기초랑 똑같이 하던가 생략하던가 택1 하셈
            input();
        System.out.print("기간(년)?");
            period = reader.read()-48;
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    protected abstract void input();

    protected void calc() {

    }

    public abstract void output(); {
//추상메서드가 하나라도 있으면 추상 클래스이고, 그러나 추상클래스에 추상메서드가 없어도 ㄱㅊ
    }
}
