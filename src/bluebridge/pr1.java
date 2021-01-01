package bluebridge;

import java.math.BigInteger;

/**
 * @author BerINs
 * @date 2020/12/21 上午12:58
 *
 * 【问题描述】
 * 7 月 1 日是建党日，从 1921 年到 2020 年， 已经带领中国人民走过了 99 年。
 * 请计算：7 ^ 2020 mod 1921，其中 A mod B 表示 A 除以 B 的余数。
 *
 * 【答案提交】
 * 这是一道结果填空题，你只需要算出结果后提交即可。
 * 本题的结果为一个整数，在提交答案时只填写这个整数，填写多余的内容将无法得分。
 */


public class pr1 {
    public static void main(String[] args) {
        BigInteger b1 = new BigInteger("7");
        BigInteger b2 = new BigInteger("1921");
        BigInteger b3 = b1.pow(2020);
        System.out.println(b3.remainder(b2));
    }
}
