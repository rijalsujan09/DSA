package sorts.bubbleSort;

public class BubbleSortMain {
    public static void main(String args []){

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
