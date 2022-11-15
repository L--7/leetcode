import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class LongestPalindrome_409 {

    public int longestPalindrome(String s) {
        Map<Character, Integer> counts = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counts.put(s.charAt(i), counts.getOrDefault(s.charAt(i), 0) + 1);
        }
        int ans = 0;
        boolean hasOdd = false;
        for (int count : counts.values()) {
            if (!hasOdd && count % 2 == 1) {
                hasOdd = true;
            }
            ans += count % 2 == 1 ? count - 1 : count;
        }
        return hasOdd && ans != 1 ? ans + 1 : ans;

    }
}
