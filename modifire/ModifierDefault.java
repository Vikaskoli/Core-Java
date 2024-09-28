package modifire;
class Defaultmodifier {
    String name = "Vikas";  //default modifier

    void display() {  //default modifier
        System.out.println("Hello " + name);
    }
}
public class ModifierDefault{
    public static void main(String[] args) {
        Defaultmodifier Defaultmodifier=new Defaultmodifier();
        Defaultmodifier.display();
        System.out.println(Defaultmodifier.name);
    }
}

