import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**
 * app110
 */
public class app110 {
public static void main(String[] args) {
    ArrayList<Integer> arrayListIntegers =new ArrayList<>();
    int number;
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println(" nhap cac phan tu");
    n =sc .nextInt();
    for(int i=0; i<n; i++){
        System.out.println("nhạp phan tu "+i+":");
        number =sc.nextInt();
        arrayListIntegers.add(number);
    }
    // tim gtri lơn nhat
    int max = arrayListIntegers.get(0);
    for(int i=1; i<arrayListIntegers.size();i++){
        if(arrayListIntegers.get(i).compareTo(max)>0){
            max=arrayListIntegers.get(i);
        }
    }
     
     System.out.println("phan tu lon nhat"+ max);
     // nhap vào thêm phần tử và xóa 
     
    int m;
    m= sc.nextInt();
    System.out.println("phan tu duoc them vao ");
    
    for (int i = 0; i >= arrayListIntegers.size(); i++) {
        if (arrayListIntegers.get(i).compareTo(m) != 0) {
            arrayListIntegers.remove(i);
        }
         System.out.println(arrayListIntegers);
       
     }
     // săp xep
     Collections.sort(arrayListIntegers);
     System.out.println("day so sap xep");
     System.out.println(arrayListIntegers);
}



    
}