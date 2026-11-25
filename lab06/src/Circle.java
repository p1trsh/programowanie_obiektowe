public class Circle extends Shape{
    double r;

    public Circle(String name, double r) {
        super(name);
        System.out.println("konstruktor Circle");
        this.r = r;
    }

    @Override
    public double area(){
        return r*3.14;
    }

    @Override
    public String getName(){
        return "Circle";
    }
}
