import java.util.Arrays;
public class isValidipV4 {
    public static void main (String [] args){
     String ipv4 = "10.10.10.10";
     boolean isValid = true;
     String [] arr =ipv4.split("\\.");
     System.out.println(Arrays.toString(arr));
     if(arr.length == 4){
         for(int i =0; i<arr.length;i++){
             if(arr[i]==""||arr[i]==null||Integer.valueOf(arr[i])>255||Integer.valueOf(arr[i])<0){
                 isValid = false;
             }
         }
         
     }else{
         isValid =false;
     }
     
     System.out.print(ipv4+ " is valid ipv4 - " +isValid );
 } 
}
