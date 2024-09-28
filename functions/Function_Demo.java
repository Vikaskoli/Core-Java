    package functions;

    import java.util.Scanner;

    class Addition{
        //Return_type fun_name(para1,para2)
        int sum(int a,int b)    //PARAMETERS OR FORMAL PARAMETERS
                                //comes under function Defination
        {
            return a + b;
        }
    }
    class sample{
        public static void printHelloWorld(){
            System.out.println("Hello World");
        }
    }


    public class Function_Demo {
        public static void main(String[] args) {
            Addition add = new Addition();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter first number:- ");
            int num1 = sc.nextInt();
            System.out.print("Enter second number:- ");
            int num2 = sc.nextInt();
            int result = add.sum(num1,num2);        //FUNCTION/method calling and passing parameters &&
                                                    // PASSING ARGUMENTS OR ACTUAL PARAMETERS
            System.out.println("The addition is:- "+result);
            System.out.println("---------------------------------------------");
            sample.printHelloWorld();
        }

    }
