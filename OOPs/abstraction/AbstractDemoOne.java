package OOPs.abstraction;

abstract class Vehicle{
    //cannot be instantiated directly. we cant able to create object of a Vehicle class directly
    public abstract void engine();
    //The method engine() is declared abstract, meaning it doesn't have an implementation
    public void horn(){
        System.out.println("Pee Pee");
    }
    //Concrete Method horn() is a regular method with a body.
    // It is fully implemented and can be used by any subclass.
}

class BMW extends Vehicle {
    @Override
    //specific implementation
    public void engine() {
        System.out.println("4000c Engine");
    }

    //subclass can have additional functionality
    public void display(){
        System.out.println("Color red");
    }
}


class Tata extends Vehicle {
    @Override
    public void engine() {
        System.out.println("2100c Engine");
    }
}

public class AbstractDemoOne  {

    public static void main(String[] args) {
        Vehicle vehicle1=new BMW();
        vehicle1.engine();

        Vehicle vehicle2=new Tata();
        vehicle2.engine();

    }
}

