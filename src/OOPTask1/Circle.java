package OOPTask1;

public class Circle extends Shape{
    private final double radius;
    public Circle(double radius){
        this.radius = radius;
    }


    @Override
    public double getArea(){
        return Math.pow(radius,2) * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return  2 * Math.PI * radius;
    }
}
