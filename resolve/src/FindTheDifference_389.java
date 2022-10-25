import java.util.HashMap;
import java.util.Map;

public class FindTheDifference_389 {
    public char findTheDifference(String s, String t) {
        Map<Character, Integer> sChars = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sChars.put(s.charAt(i), sChars.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); i++) {
            int count = sChars.getOrDefault(t.charAt(i), 0);
            if (count == 0) {
                return t.charAt(i);
            }
            sChars.put(t.charAt(i), count - 1);
        }
        return t.charAt(0);
    }

    public char findTheDifference1(String s, String t) {
        int as = 0, at = 0;
        for (char ch : s.toCharArray()) {
            as += ch;
        }
        for (char ch : t.toCharArray()) {
            at += ch;
        }
        return (char)(at - as);
    }
}
