
public class reverseString {
 public static void main (String [] args){
    String str = "HelloWorld";

    String reversedString = new StringBuilder(str).reverse().toString();

      System.out.println("Reversed String by string builder: " + reversedString);
      System.out.println("Reversed String by loop: " + reverse_String(str));
 }

 public static String reverse_String(String str) {
   String reversedString = "";
   for(int i = str.length() - 1; i >= 0; i--) {
         char ch = str.charAt(i);
         reversedString = reversedString + ch;
   }
    return reversedString;
 } 
 

}
