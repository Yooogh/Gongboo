package bank;

public interface LoanAccount{

    //대출
    long withdraw();

    //상환
    long deposit();

    //잔고 확인
    void checkBalance();
}
