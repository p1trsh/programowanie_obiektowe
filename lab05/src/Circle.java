public class Circle extends Shape{
    public Circle(double a) {
        super(a, 0);
    }

    @Override
    public double area(){
        return 3.14*a;
    }

    @Override
    public String getName(){
        return "Circle";
    }
}
