interface Animal {
    void eat();
}

interface Mammal {
    void move();
}

class Dog implements Animal, Mammal {
    @Override
    public void eat() {
        System.out.println("The dog is eating.");
    }

    @Override
    public void move() {
        System.out.println("The dog is moving.");
    }
}

public class Q47_Multiple_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Implemented from Animal interface
        dog.move(); // Implemented from Mammal interface
    }
}