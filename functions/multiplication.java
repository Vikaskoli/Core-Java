package functions;

class multiply{
   public  static void mul (int a,int b){
        int result;
        result = a * b;
        System.out.println(result);

    }

   public static int Factorial(int n){
       int f = 1;
       for(int i=1;i<=n;i++){

           f = f * i;
       }
       return f;
   }
}
public class multiplication {

    public static void main(String[] args) {
        int a=2;
        int b=4;
        multiply.mul(a,b);
        System.out.println(multiply.Factorial(4));
    }
}
