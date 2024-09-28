package functions;

class Prime_or_Not{
    public static boolean isPrime(int n){
        boolean isPrime = true;
        for(int i=2;i<=n-1;i++){
            if(n % i == 0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
public class Prime {
    public static void main(String[] args) {
        System.out.println(Prime_or_Not.isPrime(4));
    }
}
