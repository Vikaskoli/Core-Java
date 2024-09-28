package Homework.one;

//integer.MIN_VALUE     --negative infinity
//integer.MAX_VALUE
 class que9{
    public  static  int getLargest (int[] numbers){
        int largest = Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            if (largest<numbers[i]){
                largest=numbers[i];
            }

        }
        return largest;
    }
    public static void main(String[] args) {
        int[] numbers = {5,23,62,67,7,1};
        System.out.println("Largest number is:- "+ getLargest(numbers));
    }
}
