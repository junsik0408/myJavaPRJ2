import java.util.Arrays;
import java.util.Collections;

public class Code_0023 {
    public static void main(String[] args) {
        String[] strAry = {"준식","인규","현규","재홍","수진"};
                System.out.println("원본 : " + Arrays.toString(strAry));

        Collections.reverse(Arrays.asList(strAry));

        System.out.println("역순 : " + Arrays.toString(strAry));
    }
}
