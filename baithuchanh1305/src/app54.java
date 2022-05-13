import java.util.HashSet;
import java.util.Scanner;

public class app54 {
public static void main(String[] args) {
    int number ;
    HashSet<Integer>hashSetiIntegers=new HashSet<>();
    Scanner sc= new Scanner(System.in );
    // thêm các phần tử 
    hashSetiIntegers.add(3);
    hashSetiIntegers.add(10);
    hashSetiIntegers.add(2);
    hashSetiIntegers.add(4);
    hashSetiIntegers.add(5);
    // hiện thị 
    System.out.println(" các phan tu cua hashset");
    System.out.println(hashSetiIntegers);
    System.out.println(" nhap pham tu can them ");
// nếu mootj phần tử mới vào hashset từ bàn phím 
// nếu phần tử đó tồn tại thì thông báo đó sẽ tồn  tại 
number = sc.nextInt();
if(!hashSetiIntegers.contains(number)){
  hashSetiIntegers.add(number);
  System.out.println("them thành cong ");
  System.out.println("các phan tử trong hashset ");
   System.out.println(hashSetiIntegers);
}else {
    System.out.println(" phan tu"+ number+ "  đã tồn tại ");
}
}
    
}
