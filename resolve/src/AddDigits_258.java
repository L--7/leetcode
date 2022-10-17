public class AddDigits_258 {

    public int addDigits(int num) {
        do {
            int sum = 0;
            while (num != 0) {
                sum += num % 10;
                num = num / 10;
            }
            num = sum;
        } while (num >= 10);
        return num;
    }
}
