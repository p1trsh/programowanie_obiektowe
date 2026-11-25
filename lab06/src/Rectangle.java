public class Rectangle extends Shape{
    double a;
    double b;

    public Rectangle(String name, double a, double b) {
        super(name);
        System.out.println("konstruktor Rectangle");
        this.a = a;
        this.b = b;
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
