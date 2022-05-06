import java.util.Scanner;
import java.util.LinkedList;
public class app41 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in );
        LinkedList<String> linkedList =new LinkedList<>();
        linkedList.add("tháng 1 ");
        linkedList.add("tháng 2 ");
        linkedList.add("tháng 3 ");
        linkedList.add("tháng 4 ");
        linkedList.add("tháng 5 ");
        linkedList.add("tháng 6 ");
        linkedList.add("tháng 7 ");
        linkedList.add("tháng 8 ");
        linkedList.add("tháng 9 ");
        linkedList.add("tháng 10 ");
        linkedList.add("tháng 11 ");
        linkedList.add("tháng 12 ");
        System.out.println("nhap vao chỉ số cua phân tử cân flaays :");
        int index = sc.nextInt();
        /// ktra xem chỉ số có lớn hơn hoặc bằng 0 
        // và nhỏ hơn kích thước của linkedlist - 1 thì mới lấy 
    // nược lại thông bao lỗi 
    if(index<0|| (index>(linkedList.size()-1))){
        System.out.println("chỉ cần số lấy lớn hơn 0 và nhỏ hơn " + (linkedList.size()-1));
    }else {
        String node = linkedList.get(index);
        System.out.println("phan tu chỉ số bằng "+index+"trong linkedlist là "+node);
    }
    //truy cập ptu có chỉ số index trong linkedlist
    // linklist có điều kiện là 
    String firstnode = linkedList.getFirst();
    // truy cập phần tử đầu tiền trong danh sách 
    String lastnode = linkedList.getLast();
    System.out.println("\n phân tử đầu tiên trong danh sách là " +firstnode+
    "; phần tử cuối cùng trong danh sách là  :"); 

    }
    
}
