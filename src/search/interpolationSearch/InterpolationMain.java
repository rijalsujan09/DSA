package search.interpolationSearch;

public class InterpolationMain {


    /*
    Interpolation Search =>
          improvement over binary search
          best use for "uniformly" distributed element
          "guessing" where value might be based on probe result.
          if probe is incorrect, probe is narrowed and new probe is created.

          -----Time Complexity---
          average case : O(log(log(n)))
          worst case : O(n) [values increases exponentially]

     */

    public static void main(String args []){

//         int [] array = new int [8];
//        for(int i=0;i<array.length; i++){
//            array[i] = i+1;
//        }
        int [] array = {1,2,4,5,16,32,64,128,256,512,1024};

        int value  = 256;
        int index = interpolationSearch(array, value );

        if(index != -1){
            System.out.println("Element found at index : "+ index );
        }
        else {
            System.out.println("Element Not Found ..");
        }
    }

    private static int interpolationSearch(int[] array, int value) {
        int high = array.length-1;
        int low = 0;

        while(value >= array[low] && value <= array[high] && low<=high){
            int probe = low +(high-low) * (value - array[low])/
                    (array[high]-array[low]);
            System.out.println("probe: "+ probe);
            if(array[probe]==value){
                return  probe;
            } else if (array[probe] < value) {
                low = probe+1;
            }
            else {
                high = probe-1;
            }
        }
        return  -1;
    }
}
