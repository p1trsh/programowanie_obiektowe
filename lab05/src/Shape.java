public class Shape {
    double a;
    double b;

    public Shape(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double area(){
        return 0.0;
    }

    public String getName(){
        return "Shape";
    }

    public static void printShape(Shape shape){
        System.out.println(shape.getName());
        System.out.println(shape.area());
    }
}
