public class Car {
    Engine engine;
    Gearbox gearbox;

    public void start(){
        System.out.println("car started");
        engine.startEngine();
    }
}
