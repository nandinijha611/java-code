public class p5_inverted_right_triangle {
    
    public void pattern5 (int x){
        int row =x;
        for(int i =0; i<row; i++){
            for(int j=row; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        p5_inverted_right_triangle p5 = new p5_inverted_right_triangle();
        p5.pattern5(5);
    }
}
