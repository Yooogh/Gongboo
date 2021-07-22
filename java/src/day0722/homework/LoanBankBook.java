package day0722.homework;

import java.io.IOException;

public class LoanBankBook extends BankBook{
    protected int monthlyPaidAmount;
//    private int count; //인스턴스 생성 때마다 새로 생성
    //모든 인스턴스에 대해서 공통된 변수가 필요할 때는 static
    private static int count;
    public LoanBankBook() {
//        accountNum = "300-" + ++count;
//        "300-" 처럼 의미 있는 숫자 -> 1. 인터페이스 2. Enum 사용
        accountNum = String.format("%3d-%04d", BankCode.LOAN_ACCOUNT,++count);
//        %3자리-%4자리
//        BankCode의 LOAN_ACCOUNT + ++count 를 가져옴
    }

    @Override
    public void input() {
        System.out.println("대출금액?");
        try {
            total = Long.parseLong(reader.readLine());
        } catch (NumberFormatException e) {
            System.out.println(",나 특수문자 사용하지 마시고 수치만 쓰세요");
            input();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    protected void calc() {


    }

    @Override
    public void output() {
        System.out.println(custName);
        System.out.println(period);
        System.out.println(total);
        System.out.println(accountNum);
    }
}
