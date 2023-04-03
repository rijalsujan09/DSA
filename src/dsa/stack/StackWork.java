package dsa.stack;

import java.util.Stack;

public class StackWork {

    public static void main(String args[]){

//        stack work as LIFO

        Stack<String> stdName = new Stack<String>();
        System.out.println("---Here Stack is empty "+stdName.empty());
        stdName.push("Sujan");
        stdName.push("Suman");
        stdName.push("Bhuwan");
        stdName.push("Nuna");
        stdName.push("Kabi");
        System.out.println(stdName);
        System.out.println("---Here Stack is not empty "+stdName.empty());
//        stdName.pop(); // removes the top element
        System.out.println(stdName);
//        if you want to access top element without removing we can use .peak() method
        String topName = stdName.peek();
        System.out.println("---top name is "+topName);
        System.out.println(stdName.search("Sujan")); // out put is 5

        // use of stack ?
//        1. undo/redo features in text editor.
//        2. moving back/forward trough browser history
//        3. backtracking algorithms (maze, file directories)
//        4. calling functions (call stack)

    }
}
