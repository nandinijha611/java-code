public class factorial {


public static void main(String [] args){
    int n =5;
    int factloop =1;
    int factrecurssive =recurssivefact(n);

    for(int i =1; i<=n; i++){
        factloop *=i;
    }
    System.out.println("factloop " +factloop);
    System.out.println("factrecurssive " + factrecurssive);
    
}

public static int recurssivefact(int n){

    if(n==0 || n==1){
        return 1;
    }else{
        return n*recurssivefact(n-1);
    }
}

}
