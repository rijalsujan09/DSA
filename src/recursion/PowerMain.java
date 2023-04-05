package recursion;

public class PowerMain {

    public static void main(String args[]){
    int x =power(2,8);
        System.out.println("power is : "+x);
    }

    private static int power(int base , int exponent) {
        if(exponent < 1) return 1; // base case
        return  base*power(base, exponent-1); //recursive case
    }
}
