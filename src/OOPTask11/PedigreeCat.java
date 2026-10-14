package OOPTask11;

public class PedigreeCat extends Cat{
    private String breed;
    public PedigreeCat(String  name, int age, String owner, String breed){
        super(name,age,owner);
        this.breed = breed;
    }

    public String getBreed(){
        return breed;
    }
    public void setBreed(String breed){
        this.breed = breed;
    }

    @Override
    public String toString(){
        return "The cat %s is very beautiful, although she is now %d, she belongs to the breed %s, and her owner %s is very proud of her.".formatted(getName(),getAge(),getBreed(),getOwner());
    }

}
