public class Main {
    static void main() {
        //zad 4
        int[] tab = {1, 3, 7};
        ExamResults ex = new ExamResults(tab);
        System.out.println(ex.getPoints()[2]);
        tab[2] = 6;
        System.out.println(ex.getPoints()[2]);

        //zad 5
        Product p1 = new Product("kola", 3.5);
        System.out.println(Product.getNumberOfProducts());
        Product p2 = new Product("chipsy", 7.5);
        System.out.println(Product.getNumberOfProducts());

        //zad 8
        System.out.println(StaticCalculator.Add(1 ,3));
        System.out.println(StaticCalculator.Add(1 ,3, 6));
        System.out.println(StaticCalculator.Add(1.4 ,3.5));
        System.out.println(StaticCalculator.GetNumberOfOperations());

        //zad 9
        InitializationDemo obj1 = new InitializationDemo();
        InitializationDemo obj2 = new InitializationDemo();
        // 1, 2, 3, 4, 5, 3, 4, 5
    }
}
