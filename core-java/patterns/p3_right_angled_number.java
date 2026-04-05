public class p3_right_angled_number {
    
    public void pattern3(int x){

        int row =x;
        for (int i =1; i<=row; i++) {
            for(int j =1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        p3_right_angled_number p3 = new p3_right_angled_number();
        p3.pattern3(5);
    }
}
