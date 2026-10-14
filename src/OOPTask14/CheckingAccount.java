package OOPTask14;

public class CheckingAccount extends  Account{
    public CheckingAccount(int balance){
        super(balance);
    }
    @Override
    public void withdraw(int n){
         balance -= n;
    }
    public int getDebt(){
        return Math.min(balance, 0);
    }

}
