public class LastRemaining_390 {

    public static void main(String[] args) {
        System.out.println(new LastRemaining_390().lastRemaining(9));
    }

    public int lastRemaining(int n) {
        int step = 1;
        int start = 1;
        int k = 0;
        while (n > 1) {
            if (k % 2 == 0) {
                start = start + step;
            } else {
                start = n % 2 == 0 ? start : start + step;
            }
            n = n / 2;
            step = step * 2;
            k++;
        }
        return start;
    }
}
