package functions;

//Call by value
class change{
    public static void changeValue(int x){          //copy of original a=4 ==>x=4==>x=8 copy will change
        int a=8;
    }
}
public class call_by_value {
    public static  void main(String[] args){
        int a = 4;
        change.changeValue(a);
        System.out.println(a);              //it will not change original value so o/p=>4
    }

}
