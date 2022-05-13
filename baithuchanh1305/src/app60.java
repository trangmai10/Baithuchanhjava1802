import java.util.LinkedHashSet;
import java.util.Set;
public class app60 {
    public static void main(String[] args) {
        Set<String> linkedHashset= new LinkedHashSet<>();
        linkedHashset.add("java");
        linkedHashset.add("c++");
        linkedHashset.add("php");
        linkedHashset.add("C");
        for(String str : linkedHashset){
            System.out.println(str);
        }


    }
}
