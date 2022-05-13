import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class app106 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> treeMap = new TreeMap<>();
        TreeMap.put(1,9d);
        TreeMap.put(4,10f);
        TreeMap.put(1,7.2d);
        TreeMap.put(8, 20.28d);
        System.out.println("các phan tu có trong treemap:");
        Set<Map.Entry<Integer, Double>> setTreeMap = treeMap.entrySet();
        System.out.println(setTreeMap);
        treeMap.replace(4,20.11d);
        treeMap.replace(2,7.11d);
        System.out.println("cac phan tu co trong treemap sau khi thay  the:");
        setTreeMap= treeMap.entrySet();
        System.out.println(setTreeMap);

    }
    

}
