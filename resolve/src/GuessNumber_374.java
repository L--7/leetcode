public class GuessNumber_374 {
    public int guessNumber(int n) {
        int low = 0, high = n;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int result = 0; // guess(mid);
            if ( result == 0) {
                return mid;
            } else if(result == 1) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return 0;
    }
}
