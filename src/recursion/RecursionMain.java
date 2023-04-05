package recursion;

public class RecursionMain {
    /*
    Recursion = when a thing is used in terms of itself. -- Wikipedia
    Apply the result of a procedure , to a procedure.
    A recursive method calls itself. Can be a substitute for iteration.
    Divide a problem into   sub-problems of the same type as the original.
    Commonly used with advanced sorting algorithms and navigating trees.

    Advantages
    -----------
    Easier to read and Write
    Easier to Debug

    DisAdvantages
    -------------
    Sometimes it is slower
    uses more memory
     */
    public static void main (String args[]){
        walk(5);
    }

    private static void walk(int steps) {

//        for (int i = 0; i < steps ; i++) {
//            System.out.println("you take a step..");
//        }

        if(steps<1) return;
            System.out.println("You take a step..");
            walk(steps -1);

    }
}
