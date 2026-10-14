package OOPTask9;

public class Cat {
    private String name;
    private int age;
    private String owner;

    public Cat(String name, int age, String owner) {
        this.name = name;
        this.age = age;
        this.owner = owner;
    }

    @Override
    public String toString(){
        return "The cat %s is already %d. Her master %s takes care of her.".formatted(name,age,owner);
    }
}
