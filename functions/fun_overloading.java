package functions;

//function with same name but different types of parameters
//function overloading depends on parameters not on return type
class Overloading{
    public static int mul(int a,int b){
        int result;
        result = a * b;
        return result;
    }

    public static  double mul(double a,double b){
        double result;
        result = a * b;
        return result;
    }

    public static float mul(float a,float b){
        float result;
        result = a * b;
        return result;
    }
}

//Function overloading with number of parameters
class no_of_parameters{
    public static int add(int a,int b){
        return a+b;
    }

    public static int add(int a,int b,int c){
        return a+b+c;
    }
}

public class fun_overloading {
    public static void main(String[] args) {

      System.out.println(Overloading.mul(6,2));
      System.out.println(Overloading.mul(6.0,2.0));
      System.out.println(Overloading.mul(6.5f,2.5f));

      System.out.println("-------------------------------------");


      System.out.println(no_of_parameters.add(5,5));
      System.out.println(no_of_parameters.add(5,5,5));

    }
}
