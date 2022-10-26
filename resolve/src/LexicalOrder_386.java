import java.util.ArrayList;
import java.util.List;

public class LexicalOrder_386 {

    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            ans.add(num);
            if (num * 10 <= n) {
                num = num * 10;
            } else {
                while (num % 10 == 9 || num + 1 > n) {
                    num = num / 10;
                }
                num++;
            }
        }
        return ans;
    }
}
