
import java.util.LinkedList;
public class app38 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("java");
        list.add("c++");
        list.add("php ");
        list.add("java ");
        System.out.println("vi du su dung phương thuc addall()");
        System.out.println("-------------------");
        //them listA 
        LinkedList<String>listA = new LinkedList<String>();
        listA.addAll(list);
        System.out.println("listA:");
        showList(listA);
        System.out.println("\n vi dụ su dụng phương thức  removeall ()");
       System.out.println("-------------------");
       //khởi tạo listB
       LinkedList<String>listB =new LinkedList<String>();
       listB.add("java");
       //xóa  nhungc thuộc tính khởi tạo 

        list.removeAll(listB);
        System.out.println("list :");
        showList(list);
    }
   
    public static void showList(LinkedList<String> list) {
    for(String obj:list){
    System.out.println("\t"+obj + ",");
}
System.out.println();
    }
        
    }
