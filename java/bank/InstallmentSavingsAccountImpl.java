package bank;

import java.util.Scanner;

public class InstallmentSavingsAccountImpl extends Account implements InstallmentSavingsAccount{

    final double rate = 1.2; //이율

    @Override
    public long deposit() {
        Scanner sc = new Scanner(System.in);
        payment = sc.nextInt();

        balance += payment;
        System.out.println(payment + "원 입금하였습니다. 잔액은 " + balance + "원 입니다.");
        return balance;
    }

    @Override
    public long compoundInterest() { //복리 계산 : 원금 + 원금*이율^기간...
        long interest = (long) (balance + Math.pow(balance*rate, period));
        return 0;
    }

    @Override
    public long payback() { //만기환급
        balance = balance - balance;
        return balance;
    }
}
