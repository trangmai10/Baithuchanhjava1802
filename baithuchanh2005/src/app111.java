import java.util.LinkedList;
import java.util.Scanner;
public class app111 {
    public static void main(String[] args) {
        int n ;
        int node ;
        int sum=0, count=0;
        double tbcong;
        LinkedList<Integer> linkedList=  new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        System.out.println(" nhap  n vao ban phim ");
        n= sc.nextInt();
        
         for(int i=0; i<n;i++){
             System.out.println("nhap vao so phan tu "+i);
            node =sc.nextInt();
            linkedList.add(node);
         }
         for(int i=0; i<n;i++){
         if(linkedList.get(i)%2==0){
             sum+=linkedList.get(i);
             count++;
         }
        }
         tbcong=sum/count;
          System.out.println("tb cong so chăn "+tbcong);
    }
}
