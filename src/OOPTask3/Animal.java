package OOPTask3;

public class Animal {
    private final String NAME;
    private final int AGE;
    public Animal(String name, int age){
        NAME = name;
        AGE = age;
    }

    public String getName(){
        return NAME;
    }

    public int getAge(){
        return AGE;
    }
}
