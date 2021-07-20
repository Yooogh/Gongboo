import java.util.Date;

public class Account {

    String name;
    String accountNumber;
    Date startDate;
    float rate;
    long payment; //입금액
    long balance; //잔액
    long debit; //출금액

    long deposit() {
//        잔고가 있음 ->입금 -> 잔고 늘어남
        balance = balance + payment;
        return balance;
    };

    void bearInterest() {
//        잔고가 있음 -> 한 달에 한번 -> 잔고와 이율에 따라 이자액 계산 -> 이자액이 잔고에 더해짐
    }

    void withdraw() {
//        잔고가 있음 -> 출금 -> if{잔고가 0 이하인지 확인}-> 이상이면: 잔고 감소함
        long x = balance - debit;
        if(x < 0) {
            System.out.println("잔액이 부족합니다.");
        } else {
            balance = x;
            System.out.println(debit + "원 출금하였습니다. 잔액은 " + balance + "원 입니다.");
        }
    };

    void checkBalance() {
//        잔고가 있음 -> 잔고 출력함
        System.out.println("잔고는 " + balance + "입니다.");
    };


}
