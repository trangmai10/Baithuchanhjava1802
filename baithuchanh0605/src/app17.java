import java.util.ArrayList;
public class app17 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayListInteger= new ArrayList<>();
        arrayListInteger.add(0);
        arrayListInteger.add(7);
        arrayListInteger.add(1);
        arrayListInteger.add(9);
        System.out.println(" cac phan thu co trong arrlistinteger :");
             for(int number : arrayListInteger){
                 System.out.println(number +"\t");
             }
            arrayListInteger.set(3,0);
            arrayListInteger.remove(2);
            for(int number : arrayListInteger){
                System.out.println(number + "\t");
            }
    }
}
