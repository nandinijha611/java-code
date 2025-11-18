public class isPrime {
        public static void main(String[] args) {
        int n =19;
  System.out.print(n+ " is Prime " + isPrimecheck(n));
    }
    public static boolean isPrimecheck(int n){
        if (n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
             return false;
                }
            }
        return true;
        
    }
}
