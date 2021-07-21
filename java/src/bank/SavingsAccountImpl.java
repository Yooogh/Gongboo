package bank;

public class SavingsAccountImpl extends Account implements SavingsAccount{

    final double rate = 4.5;

    @Override
    public long simpleInterest() {
        //단리 : 원금+(원금*이율*기간)
        long interest = (long) (balance * rate * period);
        balance += interest;
        ac.setBalance(balance);
        return balance;
    }
}
