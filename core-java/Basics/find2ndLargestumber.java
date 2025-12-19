public class find2ndLargestumber {
    public static void main (String [] args){
    //int [] arr ={-5, -2, -2, -2};
    int [] arr ={73,4,1,5,2,36,34 };
    int max= arr[0];
    int max2 = Integer.MIN_VALUE;
    
    for(int i =0; i< arr.length; i++){
        if(max<arr[i]){
            max2 = max;
            max=arr[i];
            
        }else if (max2<arr[i] && max>arr[i]){
            max2 = arr[i];
        }
    }
    System.out.print(max2);
}
}
