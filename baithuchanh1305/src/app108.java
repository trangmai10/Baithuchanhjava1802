import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;
public class app108 {
    public static void main(String[] args) {
        TreeMap<Integer, character>treeMap = new TreeMap<>();

        TreeMap.put(6,'A');
        TreeMap.put(5,'B');
        TreeMap.put(7,'C');
        TreeMap.put(8,'D');
        TreeMap.put(6,'A');
        Set<Entry<Integer, character>> setTreeMap = treeMap.entrySet();
        System.out.println(" cac entry có trong settreemap");
        System.out.println(setTreeMap);

    }
}
