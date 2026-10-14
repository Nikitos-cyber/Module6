package OOPTask14;

public class Account {
    protected int balance;
    public Account(int balance){
        this.balance = balance;
    }

    public void withdraw(int n){
        balance -= n;
        if(balance < 0)
            balance = 0;
    }

    void put(int n){
        balance += n;
    }

}
