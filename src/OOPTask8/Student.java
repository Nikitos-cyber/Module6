package OOPTask8;

public class Student extends Person{
    private int grade;
    public Student(String name, int age, int grade){
        super(name,age);
        this.grade = grade;
    }
    public void giveGrade(){
        System.out.println(grade);
    }
    public void praise(){
        System.out.println("Молодец  - " + name);
    }

}
