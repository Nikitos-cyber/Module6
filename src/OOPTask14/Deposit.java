package OOPTask14;

public class Deposit extends  Account{
    private int period;
    private double percent;
    public Deposit(int balance, int period, double percent){
        super(balance);
        this.period = period;
        this.percent = percent;
    }

   public double withdraw(){
        if(isPeriodExpired()) {
            withdraw((int)(balance * percent));
            return balance + balance * percent;
        }
        return 0;
    }

    public void waitDays(int n){ period -= n;}
    public  boolean isPeriodExpired(){
        return period <= 0;
    }
}
