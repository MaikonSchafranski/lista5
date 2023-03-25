public class App {
    public static void main(String[] args) throws Exception {
            int[][] A = new int[3][3];
            int num = 0;

            for(int i = 0; i < A.length; i++) {
                for(int j = 0; j < A[i].length; j++) {
                    A[i][j] = num;
                    num++;
                }
            }

            for(int i = 0; i < A.length; i++) {
                for(int j = 0; j < A[i].length; j++) {
                    System.out.print(A[i][j] + " ");
                }
                System.out.println();
        }
    }
}
