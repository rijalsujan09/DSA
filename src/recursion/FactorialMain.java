package recursion;

public class FactorialMain {
    
    public static void main (String args[]){
       int x =  factorial(7);


        System.out.println("factorial of 7 is "+x);
    }

    private static int  factorial(int num) {
        if(num<1) return 1; // base case
        return  num*factorial(num-1); // recursive
    }
}
