public class InitializationDemo {

    private static String staticField = initialize("1 Statyczne pole)");

    static {
        System.out.println("2 Blok statyczny");
    }

    private String instanceField = initialize("3 Pole instancji");

    {
        System.out.println("4 Blok instancyjny");
    }

    public InitializationDemo() {
        System.out.println("5 Konstruktor");
    }

    private static String initialize(String message) {
        System.out.println(message);
        return "wartość";
    }
}