package fundamentals.programming_model.test;

import java.util.Scanner;

/**
 * @author Enigma
 * @date 2020/12/24 16:02
 */

public class T1_1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        String str = a == b && b == c ? "equal" : "not equal";
        System.out.println(str);
        System.out.println("你好");
    }
}
