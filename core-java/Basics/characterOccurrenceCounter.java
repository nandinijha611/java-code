import java.util.HashMap;

public class characterOccurrenceCounter {
        public static void main(String[] args) {
        String str = "hello nandini";
        HashMap<Character, Integer> charcount = new HashMap<>();
        for(int i =0 ; i<str.length(); i++){
            
           char ch = str.charAt(i);
           if(ch != ' ') {
    
            if(charcount.containsKey(ch)){
                charcount.put(ch, charcount.get(ch)+1);
            }else{
                charcount.put(ch,1);
            }
        }
    }
        
        System.out.print(charcount);
        
        
    }

}
