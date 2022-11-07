public class FindNthDigit_400 {

    public static void main(String[] args) {
        System.out.println(new FindNthDigit_400().findNthDigit(11));
    }

    public int findNthDigit(int n) {
        int start = 1, bit = 1;
        while ((long)start * 9 * bit < n) {
            n -= start * 9 * bit;
            bit++;
            start = start * 10;
        }
        n = n - 1; //  这里很巧妙 https://leetcode.cn/problems/nth-digit/solution/di-n-wei-shu-zi-by-leetcode-solution-mdl2/
        int position = (int)Math.pow(10, bit - 1) + n / bit;
        // // 从num中分割出第x位，如 num = 1234, n % bit = 2, 需割掉34位数，再求余10 即可得到3
        return (position / (int) Math.pow(10, bit - n % bit - 1)) % 10;
    }

}
