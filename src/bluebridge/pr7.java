package bluebridge;

import java.util.Scanner;

/**
 * @author BerINs
 * @date 2020/12/21 01:51
 * 时间限制: 1.0s 内存限制: 256.0MB 本题总分：20 分
 * 【问题描述】
 * 小明有一串很长的英文字母，可能包含大写和小写。
 * 在这串字母中，有很多连续的是重复的。小明想了一个办法将这串字达得更短：将连续的几个相同字母写成字母 + 出现次数的形式。
 * 例如，连续的 5 个 a，即 aaaaa，小明可以简写成 a5（也可能简写aa3a 等）。对于这个例子：HHHellllloo，小明可以简写成 H3el5o2。
 * 为了方达，小明不会将连续的超过 9 个相同的字符写成简写的形式。
 * 现在给出简写后的字符串，请帮助小明还原成原来的串。
 * 【输入格式】
 * 输入一行包含一个字符串。
 * 【输出格式】
 * 输出一个字符串，表示还原后的串。
 * 【样例输入】
 * H3el5o2
 * 【样例输出】
 * HHHellllloo
 * 【评测用例规模与约定】
 * 对于所有评测用例，字符串由大小写英文字母和数字组成，长度不100。
 * 请注意原来的串长度可能超过 100。
 */


public class pr7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

    }
}
