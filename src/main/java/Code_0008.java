    public class Code_0008 {
        public static void main(String[] args) {
            int[][] ary = { {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12} };

            System.out.println("ary[0][0]부터 ary[2][3]까지 출력 \n ");
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 4; j++) {
                    System.out.printf("%3d", ary[i][j]);
                }
                System.out.println("\n");
            }
        }
    }
