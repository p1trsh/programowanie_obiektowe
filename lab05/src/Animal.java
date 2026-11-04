public class Animal {
    private String name;

    public void makeSound(){
        System.out.println("animal makes sound");
    }

    public static void present(Animal animal){
        System.out.println(animal.getClass());
        animal.makeSound();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void specialAction(Animal animal){
        if (animal instanceof Dog dog) {
            dog.digHole();
        }
        else if (animal instanceof Cat cat){
            cat.climb();
        }
    }
}
