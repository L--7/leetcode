import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class RandomizedSet_380 {
    private List<Integer> elements;
    private Map<Integer, Integer> indexes;
    private Random random;
    public RandomizedSet_380() {
        elements = new ArrayList<>();
        indexes = new HashMap<>();
        random = new Random();
    }

    public boolean insert(int val) {
        if (indexes.containsKey(val)) {
            return false;
        }
        elements.add(val);
        indexes.put(val, elements.size() - 1);
        return true;
    }

    public boolean remove(int val) {
        if (!indexes.containsKey(val)) {
            return false;
        }
        int index = indexes.get(val);
        int last = elements.get(elements.size() - 1);
        elements.set(index, last);
        elements.remove(elements.size() - 1);
        indexes.put(last, index);
        indexes.remove(val);

        return true;
    }

    public int getRandom() {
        return elements.get(random.nextInt(elements.size()));
    }

}
