package search.binarySearch;

import java.util.Arrays;

public class BinarySearchMain {

    /*
    binary search  = search algorithm that finds the position
                     of a target value within a sorted array.
                     half of the array is eliminated during each step.
     */


    public static void main (String args []){

        int array[] = new int[9];
        int target = 2;
        for(int i=0; i<array.length; i++){
            array[i] =i;
        }

       // int index  = Arrays.binarySearch(array,target );
        int index  = myBinarySearch(array,target );

        if (index == -1){
            System.out.println(target+" Element not found..");
        }
        else {
            System.out.println(target+ " fount at  index "+ index);
        }

    }

private  static  int myBinarySearch(int[]array, int target){
        int low = 0;
        int high = array.length - 1;

        while(low <= high){
           int middle = low +(high - low)/2 ;
           int value = array[middle];

            System.out.println("middle value  : "+ value);

            if(value < target) low = middle+1;
            else if (value > target) high =middle-1;
            else return  middle; // target found
    }

        return  -1;  //target not found
}


}
