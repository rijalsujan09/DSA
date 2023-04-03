package dsa.linkedlist;

import java.util.LinkedList;

public class LinkedListWork {

    public static void main(String args []){

        LinkedList<String> linkedList = new LinkedList<String>();

        // using linkedList as a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
       // linkedList.pop();
        System.out.println(linkedList.peek());
        System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<String>();
        linkedList1.offer("A");
        linkedList1.offer("B");
        linkedList1.offer("C");
        linkedList1.offer("D");
        linkedList1.offer("F");
        //linkedList1.poll();
        linkedList1.add(4, "E");
        linkedList1.remove("F");
        System.out.println(linkedList1.peekFirst());
        System.out.println(linkedList1.peekLast());
        linkedList1.addFirst("0");
        linkedList1.addLast("1");
        System.out.println(linkedList1);
        System.out.println(linkedList1.removeFirst());
        System.out.println(linkedList1.removeLast());
        System.out.println(linkedList1);
    }
    /*
    LinkedList  =  stores nodes in 2 parts (data+address)
    Nodes  are in non-consecutive memory locations
    Elements are linked using pointers

    Singly Linked List
       Node                  Node                Node
    [data | address ] -> [data | address ] -> [data | address ]

        Doubly Linked List
               Node                           Node                    Node
    [address | data | address] -> [address | data | address]  -> [address | data | address]


    -----Advantages-------
    1.Dynamic Data Structure (allocates needed memory while running)
    2.Insertion and Deletion of Nodes is easy. O(1).
    3. No/low memory waste

    ----DisAdvantages-----
    1.Greater Memory usage(additional pointer)
    2. No random access of element (no index [i])
    3. accessing  and searching elements is more time-consuming. o(n)

    -----uses-----
    1.implement Stacks/Queue
    2. GPS navigation
    3. music playlist

     */
}
