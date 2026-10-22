public class Product {
    private String name;
    private double price;
    private static int numberOfProducts;
    public static final int MAX_PRODUCTS = 100;

    {
        if (numberOfProducts >= MAX_PRODUCTS){
            System.out.println("przekroczono maksymalną ilość produktów");
        }
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        numberOfProducts++;
    }

    public static int getNumberOfProducts(){
        return numberOfProducts;
    }
    // 1 powinno być static ponieważ jest to zmienna dotycząca działania tylko w środku tej klasy
    // 2 powinno być final ponieważ nie chcemy aby uległ zmianie
    // 3 nie powinno być final ponieważ wtedy utknie na jednej wartosci a ma byc zmieniane z kazdym utworzeniem produktu
}
