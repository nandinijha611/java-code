public class palindromechecker {
    
    public static void main(String[] args) {
        String str = "madam";
        String reversedStr = "";

        // Reverse the string
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedStr += str.charAt(i);
        }

        // Check if the original string is equal to the reversed string
        if (str.equals(reversedStr)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }

        if(isPalindrome(str)) {
            System.out.println(str + " is a palindrome by method.");
        } else {
            System.out.println(str + " is not a palindrome by method.");
        }   
    }

    public static boolean isPalindrome(String str) {
        boolean isPalindrome = true;

        // Reverse the string
        for (int i = 0; i <= str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        // Check if the original string is equal to the reversed string
        return isPalindrome;
    }
}
