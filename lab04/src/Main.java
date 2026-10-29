//import employee.Employee;
//import employee.Manager;
import employee.test;
import zad12A.Employee;
import zad12A.Developer;
import zad12A.Manager;
import zad12A.Tester;


void main() {
    //zad1
//    Employee p1 = new Employee("John", "Johnson", "Intern");
//    p1.displayData();
    //1. ponieważ pola private są dostępne tylko i wyłącznie w klasie do której należą
    //2. ponieważ pola protected są dostępne dla podklasy klasy do której należą
    //3. nie zawsze, jest to zależne od potrzeb projektu

    //zad 2
//    test t = new test(p1);
    //nie, nie ma dostepu ponieważ nie dziedziczy po person

    //zad3
    Car c1 = new Car("Opel", "Astra", 5);
    c1.showInformation();

    //zad4
    //a,b,c
    C c = new C();

    //zad5
    Dog dog = new Dog();
    dog.makeSound();
    Cat cat = new Cat();
    cat.makeSound();
    Cow cow = new Cow();
    cow.makeSound();

    //zad6
//    Manager m1 = new Manager("David", "Smith", "Manager", "idk");
//    m1.showInformation();

    //zad7
    Laptop laptop = new Laptop("Lenovo", 24, 7);
    laptop.dv();
    laptop.cm();
    laptop.lp();

    //zad8
    Book book = new Book("Ksiazka", "Henryk", 1998);
    System.out.println(book);
    System.out.println(book.getClass());

    //zad9
    //'initialize()' cannot override 'initialize()' in 'Game'; overridden method is final
    //Cannot inherit from final class 'zad9'

    //zad10
    Document d1 = new Document();
    Report r1 = new Report();
    d1.copy();
    r1.copy();
    //kompiluje sie

    //zad11

    //zad12
    Developer dev = new Developer("Adam", "Scott");
    dev.showInformation();
    System.out.println(dev);
}
