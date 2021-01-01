package fundamentals.programming_model.test;

/**
 * @author Enigma
 * @date 2020/12/24 16:02
 */
public class T1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;
        for (int i = 0; i <= 15; i++) {
            System.out.println(f);
            f = f + g;
            g = f - g;
        }
    }
}
