import java.util.HashMap;
import java.util.TreeMap;
public class app78 {
   
    public static void main(String[] args) {
        // khai báo 1 HashMap tên app
        // Môi phần tử trong app bao gồm 2 phần
        // key(Integer) và value (Float)
        HashMap<Integer, Float> app = new HashMap<>();
        HashMap<String, String> app1 = new HashMap<>(10);
        HashMap<Double, Double> app2 = new HashMap<>(4, 0.75f);
        HashMap<Float, Integer> app3 = new HashMap<>(new TreeMap<>());

    }
}

