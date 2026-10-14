package OOPTask7;

public abstract class Car {
    private int power;
    public Car(int power){
        this.power = power;
    }
    public int getPower(){return power;}
    public abstract void drive();
}
