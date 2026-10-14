package OOPTask2;

public class Square implements Shape {
    private final double a;
    public Square(double a){
        this.a = a;
    }

    @Override
    public double getArea(){
        return a * a;
    }
    @Override
    public double getPerimeter(){
        return a * 4;
    }
}
