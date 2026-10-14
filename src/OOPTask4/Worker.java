package OOPTask4;

public class Worker {
    private int age;
    public int salary;
    private String profession;

    public Worker(int age, int salary, String profession) {
        this.age = age;
        this.salary = salary;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public int getAge() {
        return age;
    }



}
