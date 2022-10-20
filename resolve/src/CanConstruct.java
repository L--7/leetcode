import java.util.HashMap;
import java.util.Map;

public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> dic = new HashMap();
        for (int i = 0; i < magazine.length(); i++) {
            dic.put(magazine.charAt(i), dic.getOrDefault(magazine.charAt(i), 0) + 1);
        }
        for (int i = 0; i < ransomNote.length(); i++) {
            Integer count = dic.get(ransomNote.charAt(i));
            if (count == null || count == 0) {
                return false;
            }
            count--;
            dic.put(ransomNote.charAt(i), count);
        }
        return true;
    }
}
