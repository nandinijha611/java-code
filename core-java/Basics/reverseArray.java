import java.util.Arrays;
public class reverseArray {
     public static void main (String [] args){
     int arr [] = {2, 3, 1,4,5};
     int l= arr.length-1;
     int i =0;
     while(i<l){
        int temp =arr[i];
        arr[i]=arr[l];
        arr[l]=temp;
        l--;
        i++;         
     }
     
     System.out.println(Arrays.toString(arr));
     
 } 
}
