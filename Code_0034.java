public class Code_0034 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;

        while (sum <= 100) {
            System.out.printf("%d - %d%n",i,sum);
            sum += ++i;
        }
    }
}
