public class p4_right_angled_number {
    
    public void pattern4(int x){

        int row =x;
        for (int i =1; i<=row; i++) {
            for(int j =1; j<=i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
            
        }

    }

    public static void main(String[] args) {
        p4_right_angled_number p4 = new p4_right_angled_number();
        p4.pattern4(5);
    }
}
