package OOPs.inheritance;

class superDad{
    public void mony(){
        System.out.println("Hs lot of mony");
    }
}
class Dad extends superDad{

}
class son extends Dad{

}
public class multilevel {
    public static void main(String[] args) {
        son s = new son();
        s.mony();
    }
}
