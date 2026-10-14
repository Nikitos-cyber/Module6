package OOPTask17;

public class Fiction extends Book {
    private String genre;
    public Fiction(String name, int quantityOfPages,int year, String author, String[] pages, String genre){
        super(name,quantityOfPages,year,author,pages);
        this.genre = genre;
    }

}
