import java.io.BufferedReader;
import java.io.FileReader;

public class Code_0029 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("c:/FirstJava/mydata1.txt"));
            String inStr;

            while (true) {
                inStr = br.readLine();
                if (inStr == null)
                    break;
                System.out.println(inStr);

            }

            br.close();
        } catch (Exception e) {

        }
    }
}
