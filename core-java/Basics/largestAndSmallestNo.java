public class largestAndSmallestNo {
    
    public static void main (String [] args){
     int arr[] = {2,45,23,6,1,59};
     int max = arr[0];
     int min =arr[0];
     
     for (int i : arr){
         if(i> max){
             max=i;
         }
         if(i<min){
             min=i;
         }
     }
     
        System.out.print("Max number is " +max);
        System.out.print("\nMin number is " +min);
    }
}    

