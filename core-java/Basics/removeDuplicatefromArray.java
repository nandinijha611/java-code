import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class removeDuplicatefromArray {
    public static void main(String [] args){
     Integer numbers [] = {2,3,4,5,6,2,3,2,2,3};
     Set <Integer> uniqueSet = new HashSet<>(Arrays.asList(numbers));
     Integer[] uniqueNumbers = uniqueSet.toArray(new Integer[0]);
    System.out.println("Original: " + Arrays.toString(numbers));
    System.out.println("Without duplicates: " +
    Arrays.toString(uniqueNumbers));
 } 
}
