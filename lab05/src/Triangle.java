public class Triangle extends Shape{

    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    public double area(){
        return 0.5*a*b;
    }

    @Override
    public String getName(){
        return "Triangle";
    }
}
