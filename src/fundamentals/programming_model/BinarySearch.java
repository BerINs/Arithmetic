package fundamentals.programming_model;

import java.util.Arrays;

/**
 * @author BerINs
 * @date 2020/12/24 16:02
 */


public class BinarySearch {

/**    基本情况    */
    public static int rank1(int key, int[] a) {
        int low = 0;
        int high = a.length - 1;
        while ( low <= high) {
            int mid = low + (high - low) / 2;
            if     (key < a[mid])   high = mid - 1;
            else if(key > a[mid])   low = mid + 1;
            else return mid;
        }
        return -1;
    }

/**    递归写法    */
    public static int rank2(int key, int[] a) {
        return rank2(key, a, 0, a.length - 1);
    }

    public static int rank2(int key, int[] a, int low, int high) {
        if (low > high)         return -1;
        int mid = low + (high - low) / 2;
        if (key < a[mid])       return rank2(key, a, low, mid - 1);
        if (key > a[mid])       return rank2(key, a, mid + 1, high);
        else                    return mid;
    }

    public static void main(String[] args) {
        int[] num = {91,52,33,43,52,16,72,42,53,75,93,63,48};
        Arrays.sort(num);
        int a = 5;
        System.out.println(rank1(72,num));
        System.out.println(rank2(72,num));
        System.out.printf("%d", a);
    }
}
