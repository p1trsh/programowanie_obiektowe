void main() {
    //zad1
    Animal first = new Dog();
    Animal second = new Cat();
    //1. animal, 2. dog, 3. z podklasy, 4. nie

    //zad2
    Animal[] animals = {new Dog(), new Cat(), new Cow(), new Sheep()};
    for (Animal animal : animals){
        animal.makeSound();
    }

    //zad3
    Animal.present(new Dog());
    Animal.present(new Cat());
    Animal.present(new Cow());
    //ponieważ każda z tych klas jest klasą podrzędną klasy animal wiec wszystkie mogą korzystać z jednej funkcji statycznej

    //zad4
    Employee[] employees = {new Developer(), new Tester(), new Manager(), new Administrator()};
    for (Employee employee : employees){
        System.out.println(employee.calculateSalary(10));
    }

    //zad5
    Dog dog = new Dog();
    Animal animal = dog;
    dog.makeSound();
    animal.makeSound();
    Animal.present(animal);
    Animal.present(dog);
    animal.setName("pies");
    System.out.println(animal.getName());
    dog.setName("piesek");
    System.out.println(animal.getName());
    //nie, upcasting nie tworzy nowego obiektu

    //zad6
    Animal first1 = new Dog();
    Animal second2 = new Cat();
    Dog dog1 = (Dog) first1;
    Cat cat1 = (Cat) second2;
    dog1.digHole();
    cat1.climb();
//    Dog dog2 = (Dog) second;
    //Exception in thread "main" java.lang.ClassCastException: class Cat cannot be cast to class Dog (Cat and Dog are in unnamed module of loader 'app')
    //	at Main.main(Main.java:45)

    //zad8
    zad8.makeSound(dog);
    //dodanie nowej podklasy klasy animal nie bedzie wymagalo zmiany kodu w zad8, wystarczy ze zrobimy override w nowej podklasie

    //zad9
    Parent object = new Child();
    System.out.println(object.value); //parent
    System.out.println(object.getValue()); //child

    //zad10
    Animal animal1 = new Dog();

    identify(animal1); //animal
    animal1.makeSound(); //wersje dog
    //o tym ktora wersja przeciazanej metody zostanie wykonana decyduje kompilator ktory patrzy na zadeklarowany typ zmiennej
    //nadpisywanie metod za to dziala w trakcie działania programu, na podstawie obiektu w pamieci a nie samej referencji

    //zad11
    Animal animal2 = new GuideDog();
    System.out.println(animal2 instanceof Animal); //true
    System.out.println(animal2 instanceof Dog); //true
    System.out.println(animal2 instanceof GuideDog); //true
    System.out.println(animal.getClass() == Animal.class); //false
    System.out.println(animal.getClass() == Dog.class); //true
    System.out.println(animal.getClass() == GuideDog.class); //false

    //zad12
    Payment[] payments = {new TransferPayment(), new BlikPayment(), new CardPayment()};
    for (Payment payment : payments) {
        payment.pay(99.99);
    }

    //zad13
    Shape[] shapes = {new Circle(2), new Rectangle(2,3), new Triangle(3, 4)};
    for (Shape shape : shapes){
        Shape.printShape(shape);
    }
}

static void identify(Animal animal) {
    System.out.println("Animal");
}

static void identify(Dog dog) {
    System.out.println("Dog");
}
