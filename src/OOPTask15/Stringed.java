package OOPTask15;

public class Stringed extends MusicalInstrument{
    private int quantityOfStrings;
    public Stringed(String name, String manufacturer, double price, int quantityOfStrings){
        super(name,manufacturer, price);
        this.quantityOfStrings = quantityOfStrings;
    }
    public String play(){
        return name + " sounds beautiful";
    }
}
