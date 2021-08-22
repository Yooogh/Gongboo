package bank;

import java.time.LocalDate;
import java.util.Scanner;

public class Account {

    AccountVO ac = new AccountVO();

    String name = ac.getName(); //고객이름
    String accountNumber = ac.getAccountNumber(); //계좌번호
    LocalDate startDate = ac.getStartDate(); //개설일
    double rate = ac.getRate(); //이율
    long balance = ac.getBalance(); //잔액

    long payment; //입금액
    long debit; //출금액

    int period = 12;

    String aNum1;
    String aNum2;

    //입금
    long deposit() {
        Scanner sc = new Scanner(System.in);
        payment = sc.nextInt();

        balance += payment;

        ac.setBalance(balance);
        System.out.println(payment + "원 입금하였습니다. 잔액은 " + balance + "원 입니다.");
        return balance;
    };

    //출금
    long withdraw() {
        Scanner sc = new Scanner(System.in);
        debit = sc.nextInt();
        long wdResult = balance - debit;
        if(wdResult < 0) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance = wdResult;
            ac.setBalance(balance);
            System.out.println(debit + "원 출금하였습니다. 잔액은 " + balance + "원 입니다.");
        }
        return balance;
    };

    //잔고 확인
    void checkBalance() {
        System.out.println("잔고는 " + balance + "입니다.");
    };

    //계좌 개설
    public void createAccount() {
        Scanner sc = new Scanner(System.in);

        System.out.println("신규 통장을 개설합니다.");
        System.out.println("[1]저축통장 [2]적금통장 [3]대출통장");
        int num = sc.nextInt();

        //이름
        System.out.println("이름을 입력하세요");
        String name = sc.next();
        ac.setName(name);
        System.out.println("이름 : " + name);

        //계좌번호 생성
        switch (num) {
            case 1 : aNum1 = "01";
                break;
            case 2 : aNum1 = "02";
                break;
            case 3 : aNum1 = "03";
                break;
            default:
                System.out.println("입력이 틀렸습니다.");
                break;
        }
        String aNum2 = String.valueOf((int)(Math.random()*1000));
        accountNumber = aNum1 + "-" + aNum2;
        ac.setAccountNumber(accountNumber);
        System.out.println("계좌번호 : " + accountNumber);

        //이율 (switch)
        switch (num) {
            case 1 : rate = 0.0045;
            case 2 : rate = 0.0012;
            case 3 : rate = 0.0078;
        }
        ac.setRate(rate);
        System.out.println("이율 : " + rate);

        //최초입금액
        System.out.println("입금하실 금액을 입력하세요");
        long inputBalance = sc.nextLong();
        ac.setBalance(inputBalance);
        System.out.println("최초입금액 : " + inputBalance);

        //개설일
        ac.setStartDate(startDate);
        System.out.println("개설일 : " + startDate);


        System.out.println("계좌가 개설되었습니다.");
    }
}
