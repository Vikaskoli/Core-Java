package constructor;

public class parameterized {

    int id;
    String name;
    //creating a parameterized constructor
    parameterized(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {

        //creating objects and passing values
        parameterized s1 = new parameterized(111,"Karan");
        parameterized s2 = new parameterized(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
    }

