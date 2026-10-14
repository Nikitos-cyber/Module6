package OOPTask16;

public class Helicopter extends Aircraft{
    private int screwDiameter;
    private int power;

    public Helicopter(int number, int speed, int screwDiameter, int power){
        super(number,speed);
        this.screwDiameter = screwDiameter;
        this.power = power;
    }
}
