package OOPTask3;

public class Dog extends Animal{
    private final String BREED;
    private final String  COLOR;
    public Dog(String name, int age, String breed, String color){
        super(name,age);
        BREED = breed;
        COLOR = color;

    }

    public String getBreed(){
        return BREED;
    }

    public String getColor(){
        return COLOR;
    }
}
