import java.util.HashSet;
import java.util.Scanner;
public class app56 {
    public static void main(String[] args) {
        String name ;
        HashSet<String> hashSetstring =new HashSet<>();
        Scanner sc = new Scanner(System.in );
        // thêm các phần tử 
        hashSetstring.add("wilson");
        hashSetstring.add("nike");
        hashSetstring.add("volvo");
        hashSetstring.add("lenovo");
        System.out.println(" các phần tử trong hashsetstring");
        System.out.println(hashSetstring);
        System.out.println(" nhập phần tử cần xóa ");
        name = sc.nextLine();
        
        if(hashSetstring.contains(name)){
            hashSetstring.remove(name);
            System.out.println("xoa thanh công");
            System.out.println(" các phan tu con lại ");
        }else{
            System.out.println(" xóa không thành công ");
        }


    }
}
