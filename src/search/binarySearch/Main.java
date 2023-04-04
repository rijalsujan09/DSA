package search.binarySearch;

import java.util.Arrays;

public class Main {
    public static void main (String args []){

        int array [] = new int[8] ;
        for(int i=0; i< array.length; i++){
            array[i] = i;
        }

//        for (int arr : array) {
//            System.out.println(arr);
//        }


        int target = 2;
        int index  = myBinarysearch(array, target);
        if(index != -1){
            System.out.println(target+ " is found at index "+ index);
        }
        else {
            System.out.println(target+" Target not Found");
        }
    }

    private static int myBinarysearch(int[] array, int target) {

        int low = 0;
        int high = array.length-1;
        while(low<=high){
            int middle = low +(high-low)/2;
            int midValue = array[middle];
            System.out.println("mid Index is "+ middle + " value is "+ midValue);

            if(midValue<target){
                low = middle+1;
            } else if (target<midValue) {
                high = middle-1;
            }
            else return middle;
        }

        return  -1;
    }
}
