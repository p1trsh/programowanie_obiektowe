public class Laptop extends Computer{
    double batteryCapacityWh;

    public Laptop(String manufacturer, int ramGb, double batteryCapacityWh) {
        super(manufacturer, ramGb);
        this.batteryCapacityWh = batteryCapacityWh;
    }

    public void lp(){
        System.out.println("this is a laptop with " + batteryCapacityWh + " wh of battery capacity");
    }
}
