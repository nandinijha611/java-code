public class swap2no {
        public static void main(String [] args){
        int a=10;
        int b=20;
        
        System.out.println("before swapping a = "+a+" and b = " +b);
        swapByxor( a,  b);
        swapbyarithmetic( a , b);

       
    }
    
    public static void swapByxor(int a, int b){
         a =a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping by xor a = "+a+ " and b = " + b);
    }
    public static void swapbyarithmetic(int a, int b){
         a = a+b;
         b= a-b;
         a= a-b;
        
        System.out.println("after swapping by arithmetic a = " +a +" and b = " + b);
    }
}

