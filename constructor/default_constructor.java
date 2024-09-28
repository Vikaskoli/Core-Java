package constructor;

//default constructor
class Bike1{
    //creating a default constructor
    Bike1(){
        System.out.println("Bike is created");
    }
}
public class default_constructor {
// displays the default values
    int id;
    String name;
    //method to display the value of id and name
    void display(){
        System.out.println(id+" "+name);
    }

 public static void main(String args[]){
        //calling a default constructor
        Bike1 b=new Bike1();
        //If there is no constructor in a class, compiler automatically creates a default constructor.

     default_constructor b1 = new default_constructor();
     default_constructor b2 = new default_constructor();
     ////displaying values of the object
     b1.display();
     b2.display();

    }
}


