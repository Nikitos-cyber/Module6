package OOPTask15;

public class MusicalInstrument {
    protected String name;
    private String manufacturer;
    private double price;
    public MusicalInstrument(String name, String manufacturer, double price){
        this.name = name;
        this.manufacturer = manufacturer;
        this.price = price;
    }
    public String info(){
        return  name + " " + manufacturer + " " + price;
    }
}
