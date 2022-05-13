import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class app86 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap =new HashMap<>();
        //thêm value vào hashmap vs key tương ứng 
        // phương thức put()
        // trong put có key kiểu string , value kiểu string 
        hashMap.put("csdl", " cơ so dlieu");
        hashMap.put("c++", "c++");
        hashMap.put("c#", " C sharp");
        hashMap.put("php", " php");
        hashMap.put("java", "java");

        // tạo 1 set có tên sethashmap
        Set<Map.Entry<String, String> >setHashMap =hashMap.entrySet();
        System.out.println("các entry có trong sethashmap:");
        System.out.println(setHashMap);
    }
}
