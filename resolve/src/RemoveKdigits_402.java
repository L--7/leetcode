import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class RemoveKdigits_402 {

    public String removeKdigits(String num, int k) {
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < num.length(); i++) {
            while (!stack.isEmpty() && stack.peekLast() > num.charAt(i) && k > 0) {
                stack.pollLast();
                k--;
            }
            stack.addLast(num.charAt(i));
        }
        for (int i = 0; i < k; i++) {
            stack.pollLast();
        }
        StringBuffer ans = new StringBuffer();
        boolean headZero = true;
        while (!stack.isEmpty()) {
            char c = stack.pollFirst();
            if (headZero && c == '0') {
                continue;
            }
            headZero = false;
            ans.append(c);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }

}
