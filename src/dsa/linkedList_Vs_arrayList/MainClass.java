package dsa.linkedList_Vs_arrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainClass {

    public static  void main(String  args []){

        List<Integer> linkedList = new LinkedList<Integer>();
        List<Integer> arrayList = new ArrayList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0; i<1000000; i++){
            linkedList.add(i);
            arrayList.add(1);
        }
        // ***********LinkedList work*************
        startTime = System.nanoTime();
//        linkedList.get(0);
//        linkedList.get(50000);
//        linkedList.get(999999);
//        linkedList.remove(0);
//        linkedList.remove(500000);
        linkedList.remove(999999);
        endTime = System.nanoTime();


        elapsedTime = endTime - startTime ;

        System.out.println("LinkedList:\t"+ elapsedTime + " ns");

        // ***********ArrayList work**************
        startTime = System.nanoTime();
//        arrayList.get(50000);
//        arrayList.get(999999);
//        arrayList.remove(0);
//        arrayList.remove(500000);
        arrayList.remove(999999);
        endTime = System.nanoTime();

        elapsedTime = endTime - startTime ;

        System.out.println("ArrayLis:\t"+ elapsedTime + " ns");
    }
}
