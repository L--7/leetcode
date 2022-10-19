import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class CanMeasureWater_365 {
    public static  void  main(String []args) {
        System.out.println(new CanMeasureWater_365().canMeasureWater(104597,104623,123));
    }

    public boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
        Stack<int[]> stack = new Stack<>();
        Set<Long> seen = new HashSet<>();
        stack.push(new int[]{0,0});
        while (!stack.isEmpty()) {
            int[] remains = stack.pop();
            int x = remains[0];
            int y = remains[1];
            if (seen.contains((long)x * 1000001 + y)) {
                continue;
            }
            seen.add((long)x * 1000001 + y);
            if (x == targetCapacity || y == targetCapacity || x + y == targetCapacity) {
                return true;
            }
            stack.push(new int[]{jug1Capacity, y});
            stack.push(new int[]{x, jug2Capacity});
            stack.push(new int[]{0, y});
            stack.push(new int[]{x, 0});
            stack.push(new int[]{Math.min(jug1Capacity, x + y), y - Math.min(jug1Capacity - x, y)});
            stack.push(new int[]{x - Math.min(jug2Capacity - y, x), Math.min(jug2Capacity, y + x)});
        }
        return false;
    }
}
