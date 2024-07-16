import java.util.Arrays;
public class Code_0003 {
    public static void main(String[] args) {
        String[] oldAry = {"고추짜장", "탕수육", "고추짬뽕"};
        String[] newAry;

        newAry = oldAry;

        oldAry[0] = "고추짬뽕";
        newAry[1] = "차돌짬뽕";

        System.out.println("원본 메뉴 : " + Arrays.toString(oldAry));
        System.out.println("복사 메뉴 : " + Arrays.toString(newAry));

    }
}
