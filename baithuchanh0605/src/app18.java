import java.util.ArrayList;
import java.util.Iterator;

public class app18 {
    public static void main(String[] args) {
        ArrayList<Float> arrayListFloat =new ArrayList<>();
        arrayListFloat.add(0.7f);
        arrayListFloat.add(7.36f);
        arrayListFloat.add(5.3f);
        arrayListFloat.add(10.5f);
        
        Iterator<Float>iterator = arrayListFloat.iterator() ;
        System.out.println(" cac phan tu trong arrlistfloat :");
        while (iterator.hasNext()) {
            System.out.println(interator.next()+"\t");
        }

        
    }
}
