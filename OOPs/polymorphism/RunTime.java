package OOPs.polymorphism;

// Parent class
class Animal {
    // Method to be overridden
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1
class Dog extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

// Child class 2
class Cat extends Animal {
    // Overriding the sound method
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class RunTime {
    public static void main(String[] args) {
        // Parent class reference variable pointing to a child class object
        Animal myAnimal = new Dog();
        myAnimal.sound(); // Calls the overridden method in Dog class

        myAnimal = new Cat();
        myAnimal.sound(); // Calls the overridden method in Cat class
    }
}

