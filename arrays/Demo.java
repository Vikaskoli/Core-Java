package arrays;

public class Demo {
    public static void main(String[] args) {

        //Array syntax
        //DataType[] Variable_Name = new DataType[size];

        //store 10 elements
        int[] Roll_no = new int[10];

        //declaration
        int[] MyArray;  //getting defined in stack
        MyArray = new int[5];  //initialisation, Actually object is being created(in Heap)

        //Object creation is done at run time.
        //Called Dynamic Memory allocation means memory is allocated at run time.

        //by default for the integer array it stores 0
        System.out.println(MyArray[1]);

        //String Array

        String[] arrOne = new String[5];
        //by default for the Strings array it stores null
        System.out.println(arrOne[1]);


    }
}
