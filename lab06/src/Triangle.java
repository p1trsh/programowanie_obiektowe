public class Triangle extends Shape{
    double a;
    double height;

    public Triangle(String name, double a, double height) {
        super(name);
        System.out.println("konstruktor Triangle");
        this.a = a;
        this.height = height;
    }

    @Override
    public double area(){
        return (a*height)/2;
    }

    @Override
    public String getName(){
        return "Triangle";
    }
}
