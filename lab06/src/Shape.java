import java.sql.SQLOutput;

public abstract class Shape {
    private String name;

    public Shape(String name) {
        System.out.println("konstruktor Shape");
        this.name = name;
    }

    public abstract double area();

    public String getName(){
        return name;
    }

    public void printInformation(){
        System.out.println(name);
        System.out.println(area());
    }
}
