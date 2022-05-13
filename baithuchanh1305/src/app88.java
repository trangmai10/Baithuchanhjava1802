import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class app88 {
    public static void main(String[] args) {
        HashMap<String, String> hashMapcity= new HashMap<>();
        hashMapcity.put("QN", "quảng ninh");
        hashMapcity.put("QN", "quảng nam ");
        System.out.println("danh sach cac thanh trong hashmapcity:");
        Set<Map.Entry<String, String>> setcity = hashMapcity.entrySet();
        System.out.println(setcity);
        System.out.println("QN"+ hashMapcity.get("QN"));
        System.out.println("NT" + hashMapcity.get("NT "));
        if(hashMapcity.containsValue("thanh phố hcm ")){
            System.out.println("có thành phố hcm trong hashmapcity");
        }
    }   
}
