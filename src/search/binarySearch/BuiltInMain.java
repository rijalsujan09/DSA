package search.binarySearch;

import java.util.Arrays;

public class BuiltInMain {

    public static void main (String args []){

        int array[] = new int[100];
        int target = 42;
        for(int i=0; i<array.length; i++){
            array[i] =i+1;
        }
        int index  = Arrays.binarySearch(array,target );

        if (index == -1){
            System.out.println(target+" Element not found..");
        }
        else {
            System.out.println(target+ " fount at  index "+ index);
        }

    }
}
