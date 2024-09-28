package functions;

class Swapping{
    public static void exchange(int a,int b){
        int temp =b;
        b=a;
        a=temp;

        System.out.println("Value of a:-"+a);
        System.out.println("Value of b:-"+b);
    }
}
public class swap {
    public static void main(String[] args){
        int a=2;
        int b=4;
        Swapping.exchange(a,b);

    }
}
