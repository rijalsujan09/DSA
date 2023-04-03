package dsa.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueWork {
    /*
    Queue  is a FIFO data structure. First in First Out
    A collection designed for holding elements prior to processing
    linear data structure
    --methods--
    add -- enqueue, offer() // adds to the tail.
    remove -- dequeue, poll() // removes from the head.
     */
//*****************************************************************
    public static void main(String args[]) {
        Queue<String> nameQueue = new LinkedList<String>();

        System.out.println(nameQueue.isEmpty());
        nameQueue.offer("karen");
        nameQueue.offer("chad");
        nameQueue.offer("steve");
        nameQueue.offer("harold");
        nameQueue.offer("sujan");

        System.out.println(nameQueue.peek());
        System.out.println(nameQueue);
        System.out.println(nameQueue.isEmpty());
        nameQueue.poll();
//        nameQueue.poll();
//        nameQueue.poll();  // removes the  element
//        nameQueue.poll();
//        nameQueue.poll();
        System.out.println(nameQueue.peek()); // peak the top element
        System.out.println(nameQueue);
        System.out.println(nameQueue.size()); //  return size
        System.out.println(nameQueue.contains("sujan")); // returns true


        /*
        so where are Queues usefull
        1. keyboard Buffer
        (letters should appear on the screen in the order they  are passed)
        2. Printer Queue (print jobs should be completed in order)
        2. Used in LinkedLists, PriorityQueues, Breadth-first-Search (BFS)
         */

    }

}
