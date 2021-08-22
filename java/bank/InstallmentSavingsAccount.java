package bank;

public interface InstallmentSavingsAccount{



    //입금
    long deposit();

    //이자붙음 : 월복리계산
    long compoundInterest();

    //만기 환급
    long payback();


    //정해진 날짜에 입금되는지 확인
    //월 입금액 맞는 지 확인
}
