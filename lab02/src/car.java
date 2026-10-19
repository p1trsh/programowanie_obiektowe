public class car {
    String brand;
    String model;
    int productionYear;
    double mileage;

    public car(String brand, String model){
        this(brand, model, 0, 0.0);
    }

    public car(car other){
        this(other.brand, other.model, other.productionYear, other.mileage);
    }

    public car(String brand, String model, int productionYear){
        this(brand, model, productionYear, 0.0);
    }

    public car(String brand, String model, int productionYear, double mileage) {
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.mileage = mileage;
    }

    public void drive(double distance){
        if (distance > 0){
            this.mileage += distance;
        }
    }

    public void showInformation(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year of production: " + productionYear);
        System.out.println("Mileage: " + mileage);
    }
}
