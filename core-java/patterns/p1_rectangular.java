public class p1_rectangular{

        public void pattern1(int x, int y){
            int row =x;
            int col =y;

            for(int i=0; i<row; i++){
            
                for(int j=0; j<col; j++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        public static void main (String [] args){

            p1_rectangular p1 =new p1_rectangular();
            p1.pattern1(5, 4);

    }
}
