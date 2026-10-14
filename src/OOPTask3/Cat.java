package OOPTask3;

public class Cat extends Animal{
    private final String PEDIGREE;
    private final double WEIGHT;
    public Cat(String name, int age, String pedigree, double weight){
        super(name,age);
        PEDIGREE = pedigree;
        WEIGHT = weight;
    }

    public String getPedigree(){
        return PEDIGREE;
    }

    public double getWeight(){
        return WEIGHT;
    }

}
