package dsa.dynamicArray;

public class DMain {
    public static void main (String args[]){
        DArray dArray = new DArray(5);
//        System.out.println(dArray.capacity);

        dArray.add("A");
        dArray.add("B");
        dArray.add("C");
        dArray.add("D");
        dArray.add("E");
        dArray.add("F");
        dArray.add("G");
//        dArray.insert(0, "X");

        dArray.delete("A");
        dArray.delete("B");
        dArray.delete("C");
        dArray.delete("G");

        System.out.println(dArray);
        System.out.println("size: "+ dArray.size);
        System.out.println("capacity: "+ dArray.capacity);
        System.out.println("empty: " + dArray.isEmpty());
        System.out.println("index : "+dArray.search("E"));
    }
}
