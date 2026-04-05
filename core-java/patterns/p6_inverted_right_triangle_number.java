public class p6_inverted_right_triangle_number {
   
    /*
    public void pattern6 (int x){
        int row =x;
        for(int i=row; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }

    }
    */
    
     public void pattern6(int N) {
        // Outer loop for rows
        for (int i = 0; i < N; i++) {
            // Inner loop for columns
            // Prints numbers from 1 up to (N - i)
            for (int j = N; j > i; j--) {
                System.out.print((N - j + 1) + " ");
            }
            // Move to next line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        p6_inverted_right_triangle_number p6 = new p6_inverted_right_triangle_number();
        p6.pattern6(5);
    }
}
