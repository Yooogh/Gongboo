package bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Account ac = new Account();
        AccountVO acVo = new AccountVO();
        Scanner sc = new Scanner(System.in);

        System.out.println("계좌번호를 입력해주세요. 계좌를 개설하려면 [0]을 입력하세요.");
        int num = sc.nextInt();
        if (num == 0)
            ac.createAccount();//신규 통장 개설
        String acNum = acVo.getAccountNumber();

        if (acNum.substring(0, 1).equals("01")) {
            SavingsAccountImpl sa = new SavingsAccountImpl();
            System.out.println("저축통장: [1]입금하기 [2]출금하기 [3]잔고 확인");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 : sa.deposit();
                case 2 : sa.withdraw();
                case 3 : sa.checkBalance();
            }
        } else if (acNum.substring(0, 1).equals("02")) {
            InstallmentSavingsAccountImpl ia = new InstallmentSavingsAccountImpl();
            System.out.println("적금통장 [1]입금하기 [2]잔고 확인");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 : ia.deposit();
                case 2 : ia.checkBalance();
            }
        } else if (acNum.substring(0, 1).equals("03")) {
            LoanAccountImpl la = new LoanAccountImpl();
            System.out.println("대출통장 [1]대출하기 [2]상환하기 [3]대출액 확인");
            int menu = sc.nextInt();
            switch (menu) {
                case 1 : la.withdraw();
                case 2 : la.deposit();
                case 3 : la.checkBalance();
            }
        }
    }
}