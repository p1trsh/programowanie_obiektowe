public class Device {
    String manufacturer;

    public Device(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void dv(){
        System.out.println("it is a device from " + manufacturer);
    }
}
