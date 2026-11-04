public class Rectangle extends Shape{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area(){
        return a*b;
    }

    @Override
    public String getName(){
        return "Rectangle";
    }
}
