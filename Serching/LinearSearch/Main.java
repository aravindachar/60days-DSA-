package Serching.LinearSearch;

public class Main {

    public static void main(String[] args) {
        // the array of numbers 
        int[] numbers = {45,65,78,54,65,85,96,25,54,65};
        // target number you want to search
        int target = 65 ;
        int target2 = 96 ;
        int ans = linear(numbers, target);
        System.out.println(ans);
        // boolean values
        boolean boolans = linear1(numbers, target);
        System.out.println(boolans);

        // return Maxt
        int ans2 = linearSearch2(numbers, target2);
        System.out.println(ans2);
    }

    //boolearn 
        static boolean linear1(int[] arr , int target){
            if(arr.length == 0){
                return false ;
            }
            for(int index = 0 ; index <= arr.length ; index++){
                int element = arr[index];
                if(element == target){
                    return true ;
                }
            }
            return false ;
        }


        static int linearSearch2(int[] arr, int target) {
            if (arr.length == 0) {
                return -1;
            }
    
            // run a for loop
            for (int element : arr) {
                if (element == target) {
                    return element;
                }
            }
            // this line will execute if none of the return statements above have executed
            // hence the target not found
            return Integer.MAX_VALUE;
        }
    





    // create a class of linear search
        static int linear(int[] arr, int target){
            if (arr.length == 0){
                return -1 ;
            }
            for(int index = 0 ; index <= arr.length ;index++){
                    int element = arr[index];
                    if (element == target) {
                        return index ;
                    }
                    
            }
            
        return -1;
}
}