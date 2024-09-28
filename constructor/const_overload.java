package constructor;

//Constructor overloading in Java is a technique of having more than one constructor with different parameter lists.
// They are arranged in a way that each constructor performs a different task.
// They are differentiated by the compiler by the number of parameters in the list and their types.
public class const_overload {
    int id;
    String name;
    int age;
    //creating two arg constructor
    const_overload(int i,String n){
        id = i;
        name = n;
    }
    //creating three arg constructor
    const_overload(int i,String n,int a){
        id = i;
        name = n;
        age=a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String args[]){
        const_overload s1 = new const_overload(111,"Karan");
        const_overload s2 = new const_overload(222,"Aryan",25);
        s1.display();
        s2.display();
    }
}

