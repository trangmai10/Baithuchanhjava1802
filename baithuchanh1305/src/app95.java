import java.util.LinkedHashMap;
import java.util.Set;
public class app95 {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String>linkedHashMap= new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "java");
        linkedHashMap.put(2, "c++");
        linkedHashMap.put(3, "php");
        linkedHashMap.put(4, "python");
        System.out.println("before remove");
        show(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("after remove:");
        show(linkedHashMap);

    }   
    // show hashmap 
    public static void show(LinkedHashMap<Integer, String>linkedHashMap){
        Set<Integer> keySet = linkedHashMap.keySet();
        for(Integer key : keySet){
            System.out.println(key +""+ linkedHashMap.get(key));
        }
    }
}
