package arrays;

//Linear search is used to search a key element from multiple elements
public class linear_Search {

    public static int position(int[] numbers,int key){
        for(int i=0;i<=numbers.length;i++){
            if(numbers[i] == key){
                return  i;
            }
        }
        return -1;
    }

    public static int menu(String[] menuItems, String keyword) {  // Changed return type to int
        for (int j = 0; j < menuItems.length; j++) {
            if (menuItems[j].equals(keyword)) {  // Use equals to compare strings
                return j;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {4,53,6,44,7,3,88};
        int key = 44;
        int index = position(numbers,key);

        if(index == -1){
            System.out.println("Not found");
        }else{
            System.out.println("Number found at index:- "+index);
        }
        System.out.println("----------------------------------------------------------");
        String[] menuItems = {"Samosa","Kachodi","VadaPav","Sandwich"};
        String keyword = "VadaPav";
        int atindex = menu(menuItems,keyword);
        if(atindex == -1){
            System.out.println(" Not found");
        }else{
            System.out.println("Item found at index:- "+ atindex);
        }

    }
}
