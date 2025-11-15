public class vowelConsonantCount {
    
    public static void main(String [] args){
        
    String str = "Hello world Nandini";
    str= str.toLowerCase();
    int vowel =0, consonant=0;
    
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >='a' && ch<='z'){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'|| ch=='u'){
                    vowel++;
                }else{
                    consonant++;
                    
                }
                }
            }
        
        
        System.out.print("Count of vowel " +vowel+ " and consonat " + consonant);
        
    }

    public static boolean isVowel(char ch){
        char arr [] ={'a', 'e', 'i', 'o', 'u'};
        boolean isVowel = false;
        for (char vow: arr){
        if(ch==vow){
            isVowel = true;
        }
        }
        return isVowel;
    }


}
