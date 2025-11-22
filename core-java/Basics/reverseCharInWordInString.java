public class reverseCharInWordInString {
   
public static void main (String [] args){
    String inputString = "nandini4 name2 jha6 my1 is3 rahul5";
    String str =reorderingString(inputString);
    System.out.println(str);
    //String intermidiateString="my name is nandini rahul jha";
    //Finalo/p = ym eman si inidnan luhar ahj
    String opstring ="";
    
    String [] arr =str.split(" ");
    for(int j=0; j<arr.length; j++){
        opstring += reverseString(arr[j])+ " ";
    }
    
    System.out.print(opstring);
    
    
    
}

public static String reverseString(String ipstring){
     String reversedString="";
    for(int i =ipstring.length()-1;i>=0;i--){
        reversedString += String.valueOf(ipstring.charAt(i));
    }
    return reversedString;
}

public static String reorderingString(String ipstring){
    String reorderedString="";
    String arr[] =ipstring.split(" ");
    String correctarr [] =new String[arr.length];
    for(String word : arr){
        char index = word.charAt(word.length()-1);
       int correctIndex = Character.getNumericValue(index)-1;
       
       correctarr[correctIndex] = word.replace(String.valueOf(correctIndex+1) , "");
    }
    
    for (String k : correctarr){
        reorderedString += k +" ";
    }
    
    
    return reorderedString;
}
   
}
