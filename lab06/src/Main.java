void main() {
    //zad1
//    Circle circle = new Circle(3);
//    Rectangle rectangle = new Rectangle(2,3);
//    Triangle triangle = new Triangle(3,2);
//
//    Shape[] shapes = {circle, rectangle, triangle};
//
//    for (Shape shape : shapes){
//        shape.printInformation();
//    }

    //zad2
    Circle circle = new Circle("circle", 3);
    Rectangle rectangle = new Rectangle("rectangle", 2, 3);
    Triangle triangle = new Triangle("triangle", 3, 2);

    Shape[] shapes = {circle, rectangle, triangle};

    for (Shape shape : shapes) {
        shape.printInformation();
    }

    //zad3
    Developer dev = new Developer("dev", 50);
    Manager manager = new Manager("manager", 50);
    Salesperson salesperson = new Salesperson("sales", 50);
    Employee[] employees = {dev, manager, salesperson};
    for (Employee employee : employees) {
        employee.printPayslip();
    }

    //zad4
    Printable[] elements = {new Invoice(), new Report(), new Ticket()};
    for (Printable element : elements) {
        element.print();
    }

    //zad5
    Report report = new Report();
    Printable printable = report;
    Exportable exportable = report;
    Savable savable = report;
    printable.print();
    exportable.export();
    savable.save();

    //zad6
    Invoice invoice = new Invoice();
    report.printHeader();
    invoice.printHeader();

    //zad7
    //C inherits unrelated defaults for hello() from types A and B
    C c = new C();
    c.hello();

    //zad8
    TextDocument text = new TextDocument();
    text.read();
    text.write();

    //zad9
    Eagle eagle = new Eagle();
    eagle.eat();
    eagle.fly();
    Penguin penguin = new Penguin();
    penguin.eat();
    //nowy projekt jest lepszy poniewaz kazdy obiekt dziedziczacy po Bird nie umie od razu latac, potrafi dopiero uzywajac interfejsu Flyable, co jest potrzebne aby oddzielic np Penguin od Sparrow

    //zad10
    //Car HAS-A Engine kompozycja/agregacja
    //Dog IS-A Animal dziedziczenie
    //House HAS-A Address kompozycja/agregacja
    //Manager IS-A Employee dziedziczenie
    //Computer HAS-A Processor kompozycja/agregacja
    //Student USES-A University inna asocjacja
    //Book HAS-A Author kompozycja/agregacja
    //Order USES-A PaymentMethod inna asocjacja

    //zad11
    Car car = new Car();
    car.engine = new Engine();
    car.start();
    //dziedziczenie byłoby błedem ponieważ car nie jest silnikiem a jedynie z jego korzysta

    //zad12
    OrderService order1 = new OrderService(new BlikPayment());
    OrderService order2 = new OrderService(new CardPayment());
    OrderService order3 = new OrderService(new TransferPayment());
    OrderService[] orders = {order1, order2, order3};
    for (OrderService order : orders){
        order.checkout(30);
    }

    //zad13
    //ReportService może należeć do jakiejś konkretnej bazy danych ale sam w sobie nie jest bazą danych
    //Jedyne co robimy to używamy funkcji która jest opisana w innym skrypcie

    //zad14
    ReportService report1 = new ReportService();
    report1.storage = new DatabaseStorage();
    ReportService report2 = new ReportService();
    report2.storage = new FileStorage();
    ReportService report3 = new ReportService();
    report3.storage = new ConsoleStorage();
    ReportService[] reports = {report1, report2, report3};
    for (ReportService _report : reports){
        _report.storage.save("111");
    }

    //zad15
    //Shape - klasa abstrakcyjna, jest potrzebny wspolny stan, istnieje naturalne is-a, nie, tak
    //Printable - interfejs, nie jest, nie, tak, nie
    //Employee - klasa abstrakcyjna, tak, tak, nie, tak
    //Comparable - interfejs, nie jest, nie, tak, nie
    //Vehicle - klasa abstrakcyjna, tak, tak, nie, tak
    //Encryptable - interfejs, nie, nie, tak, nie
    //NotificationSender - interfejs, nie, nie, tak, nie
    //Account - klasa abstrakcyjna, tak, tak, nie, tak
}