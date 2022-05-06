import java.util.ArrayList;

public class app16 {


public static void main(String[] args) {
    ArrayList<String> arrayListString =new ArrayList<>();
    arrayListString.add("java");
    arrayListString.add("php");
    arrayListString.add("c#");
    arrayListString.add("c++");
System.out.println("cac phan tu có trong arraylistString ");
for( int i=0 ; i<arrayListString.size();i++){
System.out.println(arrayListString.get(i)+ "\t");
}
arrayListString.set(2, "C");
arrayListString.remove(3);
for( int i=0 ; i<arrayListString.size();i++){
    System.out.println(arrayListString.get(i)+ "\t");


}
}
    
}