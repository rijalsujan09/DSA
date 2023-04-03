package dsa.queue;

import java.util.*;

public class PriorityQueues {
    /*
    PriorityQueue is a FIFO Data structure that
    serves the highest priority  properties first
    before element with lower priority
     */
    public static void main(String args []){

//        Queue<Double> gpa = new PriorityQueue<>(Collections.reverseOrder());
//        gpa.offer(3.5);
//        gpa.offer(2.5);
//        gpa.offer(4.0);
//        gpa.offer(1.5);
//        gpa.offer(2.0);
//
//        while(!gpa.isEmpty()){
//            System.out.println(gpa.poll());
//        }

        Queue<String> str = new PriorityQueue<>(Collections.reverseOrder());
        str.offer("A");
        str.offer("C");
        str.offer("D");
        str.offer("B");
        str.offer("F");

        while (!str.isEmpty()){
            System.out.println(str.poll());
        }
    }
}
