package day0722.homworkUse;

import day0722.homework.LoanBankBook;

public class BankBook {
    public static void main(String[] args) {
        //계좌번호 자동생성부분
        LoanBankBook cust1 = new LoanBankBook();
        LoanBankBook cust2 = new LoanBankBook();
        LoanBankBook cust3 = new LoanBankBook();
        LoanBankBook cust4 = new LoanBankBook();
        LoanBankBook cust5 = new LoanBankBook();

        cust5.baseInput(); //binding

        cust5.output(); // 300-0002  계좌번호 생성 -> 1. 생성자로 하기 2. 메소드 만들기
    }
}
