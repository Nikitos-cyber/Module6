package OOPTask7;

public class Bus extends Car {
    public int passengers;
    public Bus(int power, int passengers){
        super(power);
        this.passengers = passengers;
    }

    @Override
    public void drive(){
        System.out.println("Passengers: " + passengers + "Power: " + getPower());
    }
}
