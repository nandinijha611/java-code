import java.util.Arrays;

public class checkIfArraySorted {
     public static void main (String [] args){
     int arr [] = {2, 3, 4,5};
     boolean isSorted= true;
     for (int i =0; i<arr.length-1;i++){
         if(arr[i]>arr[i+1]){
             isSorted = false;
         }
     }
     
     System.out.println(Arrays.toString(arr) + " - " + isSorted);
    }
}
