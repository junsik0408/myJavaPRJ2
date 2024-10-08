import java.util.Arrays;

public class Code_0012 {
    static int lotto_method() {
        int lottonum = (int)(Math.random()*45+1);
        return lottonum;
    }

    public static void main(String[] args) {
        int[] lottoAry = {};
        int num = 0;
        System.out.println("** 로또 추첨을 시작합니다. **");

        my_loop :
        while(true){
            num = lotto_method();

            for (int v : lottoAry) {
                if (v == num)
                    continue my_loop;
            }
            lottoAry = Arrays.copyOf(lottoAry, lottoAry.length + 1);
            lottoAry[lottoAry.length - 1] = num;
            if (lottoAry.length == 6)
                break;
        }

        Arrays.sort(lottoAry);
        System.out.print("오늘의 로또 번호 ==> ");
        System.out.println(Arrays.toString(lottoAry));
    }
}