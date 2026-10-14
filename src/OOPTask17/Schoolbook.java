package OOPTask17;

public final class Schoolbook extends Book{
    private String subject;
    private int grade;
    public Schoolbook(String name, int quantityOfPages,int year, String author, String[] pages, String subject, int grade){
        super(name,quantityOfPages,year,author, pages);
        this.subject = subject;
        this.grade = grade;
    }

}
