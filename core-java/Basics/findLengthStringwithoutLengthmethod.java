public class findLengthStringwithoutLengthmethod {
    
    public static void main(String [] args){
     String str="nandini";
      int length =0;
     
     try{
         while(true){
             str.charAt(length);
             length++;
         }
     }catch(StringIndexOutOfBoundsException e){
         System.out.print(length);
     }
    }
}
