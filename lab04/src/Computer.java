public class Computer extends Device{
    int ramGb;

    public Computer(String manufacturer, int ramGb) {
        super(manufacturer);
        this.ramGb = ramGb;
    }

    public void cm(){
        System.out.println("this is a computer with " + ramGb + " gb of ram");
    }
}
