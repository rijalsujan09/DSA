package sorts.bubbleSort;

public class BubbleSortMain {
    public static void main(String args []){

        /*
        bubble sort =>
        pairs of adjacent elements are compared,
        and the elements are swapped if they are not iin order.

        Time Complexity = quadratic time O(n^2)
        small data set it's Ok
        but, larger dataset it,s Complicated.
         */

        int array [] = { 9,1,4,2,3,6,5,8,7};
        bubblesort(array);
        for (int elm : array) {
            System.out.print(elm+" ");
        }

    }

    private static void bubblesort(int[] array) {
        int temp;
//        { 9,1,4,2,3,6,5,8,7}
//         bubble sort logic
        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j< array.length-i-1 ; j++) {
                    if(array[j] > array[j+1])// ascending order
//                    if(array[j] > array[j+1])// descending order
                {
                    temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }
        }
    }
}
