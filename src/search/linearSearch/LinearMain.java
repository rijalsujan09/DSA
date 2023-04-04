package search.linearSearch;

public class LinearMain {
    public static void main (String args[]) {
        int[] array = {9, 1, 8, 7, 3, 6, 4, 5};

        int value = 12;
        int index =  linearSearch(array , value);

        if(index != -1){
            System.out.println("The index of "+value+" is "+ index + " !");
        }
        else {
            System.out.println("Element not found..");
        }

    }
        private static int linearSearch(int[] array, int value){

        for(int i=0; i<array.length; i++){
            if(array[i] == value){
                return  i;
            }
        }
            return -1;
    }
}
