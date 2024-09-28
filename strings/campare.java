package strings;

public class campare {
    public static void main(String[] args) {

        //  ==  targets to the object level
        //string without new points to the old value
        //with new, new value is created
        String str1 = "Vikas";
        String str2 = "Vikas";
        String str3 = new String("Vikas");

        if (str1 == str2){
            System.out.println("String is equal");
        }else {
            System.out.println("Not");
        }
//--------------------------------------------------------
//        if(str1 == str3){
//            System.out.println("String is equal");
//        }else {
//            System.out.println("not");
//        }
  //--------------------------------------------------
        if(str1.equals(str3)){                  //equqlities in values 
            System.out.println("String is equal");
        }
        else {
            System.out.println("not");
        }
    }
}
