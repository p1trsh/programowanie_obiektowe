public class zad {
    static void main(String[] args) {
        //zad 1
        dog pies1 = new dog("Henio","Owczarek Niemiecki",9);
        dog pies2 = new dog("Ziutek", "Buldog", 6);

        pies1.bark();
        pies2.bark();
        pies1.showInformation();
        pies2.showInformation();

        //zad 2
        point p1 = new point(1,1);
        point p2 = new point(5, 3);
        System.out.println(p1.distance(p2));

        //zad 3
        book book1 = new book();
        book book2 = new book("ksiazka", "john johnson");
        book book3 = new book("ksiega", "steve smith", 2014);

        //zad 4
        car car1 = new car("opel", "astra");
        car1.showInformation();
        car1.drive(12.5);
        car1.showInformation();
        //zad 5
        car car2 = new car(car1);
        car1.productionYear = 2014;
        car1.showInformation();
        car2.showInformation();
        //drugi obiekt nie został zmieniony, ponieważ
        //skopiowanie obiektu stworzyło nowy oddzielny obiekt o takich samych wartosciach
        //nie jest to ta sama referencja

        //zad 6
        person first = new person("Anna");
        //person second = first;

        //second.name = "Maria";
        first.introduceYourself();
        //second.introduceYourself();
        //zakomentowany kod w celu zrobienia zadania 7
        //1. powstal 1 obiekt
        //2. istnieja 2 referencje
        //3. Zmiana jest widoczna również dla first,
        //ponieważ skopiowaliśmy jedynie wskaźnik do referencji
        //więc modyfikując zmienne modyfikujemy ten sam obiekt

        //zad 7
        person second = new person(first);
        second.name = "Monika";
        second.introduceYourself();
        first.introduceYourself();
        //konstruktor kopiujacy tworzy zupelnie nowy obiekt jedynie kopiujac do niego dane z innego, dlatego wiec
        //zmiana imienia powoduje zmiane tylko dla "second", nie jest to juz ta sama referencja jak w poprzednik przypadku

        //zad 8
        counter c1 = new counter();
        counter c2 = new counter(4);
        System.out.println(c1.value);
        System.out.println(c2.value);
        c1.increaseOther(c2);
        c2.increaseOther(c1);
        System.out.println(c1.value);
        System.out.println(c2.value);
        // zmienne c1, c2 to jedynie wskaźniki do referencji obiektów, dlatego odwołując się do miejsca w pamięci,
        //jesteśmy w stanie zmienić stan tych obiektów.

        //zad 9
        car car = null;
        //car.showInformation();
        //przewiduje, że wyskoczy błąd
        //po sprawdzeniu: Exception in thread "main" java.lang.NullPointerException: Cannot invoke "car.showInformation()" because "car" is null
        //	at zad.main(zad.java:72)
        if (car != null){
            car.showInformation();
        }

        //zad 10
        Box a = new Box(10);
        Box b = a;
        Box c = new Box(a.value);

        b.value = 20;
        c.value = 30;

        System.out.println(a.value); //20
        System.out.println(b.value); //20
        System.out.println(c.value); //30

        System.out.println(a == b); //true
        System.out.println(a == c); //false
        //a-----> box1 (obiekt)
        //b----/
        //c------> box2 (obiekt)

        //zad 11
        Product product =
                new Product("Monitor", 1200);
        product.show();
        //kod nie kompiluje sie poniewaz konstruktor jest zle zadeklarowany, (zwraca typ "void" oraz to ze nie przypisujemy mu wartosci podanych
        //jako argumenty, a jedynie ustawiamy wartosc argumentow na ta sama dlatego potrzebne jest tam "this")

        //zad 12
        Produkt pr1 = new Produkt("Bluza", 89.99);
        Produkt pr2 = new Produkt("T-Shirt", 49.99);
        Klient k1 = new Klient("Krzysztof", "Kowalski", "1 Maja 3");
        Klient k2 = new Klient("Jakub", "Lewandowski", "Myszki Miki 14");
        Zamowienie z1 = new Zamowienie(1, pr1, k1);
        Zamowienie z2 = new Zamowienie(2, pr2, k2);
        z1.showOrder();
        z2.showOrder();
    }
}
