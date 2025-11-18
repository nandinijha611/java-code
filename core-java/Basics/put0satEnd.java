public class put0satEnd {
    public static void main (String [] args){
    int arr[] = {0,0,0,0,2,0,0,4,12,5,0,0,3,4,0,0,0,0};
    int l=0;
    
    for (int i= 0;i<=arr.length -1;i++){
        if(arr[l]==0 && arr[i]!=0){
        swap(arr, i ,l);
        l++;
        }
    }
    for (int i= 0;i<arr.length;i++){
        System.out.print(arr[i] +" ");
    }
}

public static void swap(int [] arr, int x, int y){
    int temp = arr[x];
    arr[x]=arr[y];
    arr[y]=temp;
}
}
