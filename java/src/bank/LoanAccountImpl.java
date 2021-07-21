package bank;

import java.util.Date;
import java.util.Scanner;

public class LoanAccountImpl extends Account implements LoanAccount{

    long loan = ac.getBalance() * -1; //대출액(음수)
    long monthPayment = loan / 12; //월납입액
    Date endDate; //만기일
    long interest = (long)(loan * rate); //이자액

    @Override
    public long withdraw() { //대출하기
        Scanner sc = new Scanner(System.in);
        loan = sc.nextLong();

        System.out.println("대출액 : " + loan);
        long result = loan + debit;

        ac.setBalance(loan);
        return loan;
    }

    public long bearInterest() { //이자 붙기
        loan -= interest;
        ac.setBalance(loan);
        return loan;
    }

    @Override
    public long deposit() { //상환하기
        Scanner sc = new Scanner(System.in);
        payment = sc.nextLong();

        if (payment < monthPayment) {
            loan += payment;
            ac.setBalance(loan);
            System.out.println(payment + "원 상환하였습니다. 남은 대출액은 " + loan + "원 입니다.");
            System.out.println("월 상환 금액 미달입니다.");
        } else{
            loan += payment;
            ac.setBalance(loan);
            System.out.println(payment + "원 상환하였습니다. 남은 대출액은 " + loan + "원 입니다.");

            if (payment > loan) {
                long more = payment - loan;
                System.out.println("대출액을 " + more + "원 초과하였습니다.");
            }
        }
        return loan;
    }

    @Override
    public void checkBalance() {
        System.out.println("남은 대출액은 " + loan + "원 입니다.");
    }
}
