public class validPalindromeWithSpecialChar {
    

public static void main (String [] args){
    String str="Aman,aPlan,acanal:panama";
    int l =str.length()-1;
    int i=0;
    boolean flag = true;
    
    while(l>=i){
        if((!Character.isLetter(str.charAt(i)))||(Character.isDigit(str.charAt(i)))){
        i++;}
        if((!Character.isLetter(str.charAt(l)))||(Character.isDigit(str.charAt(l)))){
        l--;}
        if(Character.isLetter(str.charAt(i)) && Character.isLetter(str.charAt(l))){
            if(Character.toLowerCase(str.charAt(i))!=Character.toLowerCase(str.charAt(l))){
                flag=false;
            }
            i++;
            l--;
        }
        
    }
    System.out.print("String is palindrome : " + flag);
    
}
}
