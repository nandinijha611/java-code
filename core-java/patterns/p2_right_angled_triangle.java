public class p2_right_angled_triangle {
    public void pattern_2(int x){
        int row=x;

        for(int i=0; i<row; i++){
            for(int j =0; j<=i; j++){
                System.out.print("* ");
            }
            System.err.println();
        }
        
    }

    public static void main(String[] args) {
        p2_right_angled_triangle p2 =new p2_right_angled_triangle();
        p2.pattern_2(5);
    }
}
