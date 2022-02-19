import java.util.Scanner;

public class app47 {
    public static void main(String[] args)
    {   Scanner sc= new Scanner(System.in);
        int n;
        int tong=0;
        do
            {   System.out.println("nhap vao so nguyen bat ki: ");
                n=sc.nextInt();
                tong+=n;
            }
        while(tong<100);
        System.out.println("tong cac so vua nhap la: "+tong);
    }
    
}
