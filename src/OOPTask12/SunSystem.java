package OOPTask12;

public class SunSystem extends StarSystem {
    private long population;
    public SunSystem(int quantityOfPlanets, long age, long population){
        super("sun", quantityOfPlanets,age);
        this.population = population;
    }
    public long getPopulation(){return population;}
    public String getInfo(){
        return "This is the most densely populated star system in the universe(probably)";
    }
}
