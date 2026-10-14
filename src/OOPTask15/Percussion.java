package OOPTask15;

public class Percussion extends MusicalInstrument{
    private int year;
    public Percussion(String name, String manufacturer, double price,  int year){
        super(name,manufacturer,price);
        this.year = year;
    }

    public String play(){
        return "Bump";
    }
}
