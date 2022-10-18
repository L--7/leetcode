public class IsPerfectSquare_367 {
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int init = 1;
        while (init <= num / 2) {
            if (init * init == num) {
                return true;
            }
        }
        return false;
    }

    public boolean isPerfectSquare1(int num) {
        int left = 0, right = num;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            long square = (long) mid * mid;
            if (square < num) {
                left = mid + 1;
            } else if (square > num) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

}
