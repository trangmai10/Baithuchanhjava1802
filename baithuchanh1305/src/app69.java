import java.util.TreeSet;
import java.util.Set;
import java.util.Scanner;
public class app69 {
    public static void main(String[] args) {
        int number;
        int n;

        TreeSet<Integer> treeSetIntegers= new TreeSet<>();
        Scanner sc = new Scanner(System.in);
        treeSetIntegers.add(0);
        treeSetIntegers.add(3);
        treeSetIntegers.add(2);
        treeSetIntegers.add(3);
        System.out.println("các phần tử trong tresetinterget");
        System.out.println(treeSetIntegers);
        System.out.println("nhap thong tin can them ");
        
        number =sc.nextInt();
        n =sc.nextInt();
        if(!treeSetIntegers.contains(number)){
            treeSetIntegers.add(number);
            System.out.println("them thanh cong ");
            System.out.println("cac phan tu trong treeset sau khi them  ");
            System.out.println(treeSetIntegers);
        }else{
            System.out.println("phan tu"+ number+"da ton tại");
        }
    }
}
