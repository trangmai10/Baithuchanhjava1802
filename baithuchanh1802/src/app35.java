import java.util.Scanner;

public class app35 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        float so1,so2;
        System.out.println("Nhap vao 2 so bat ki: ");
        so1 = sc.nextFloat();
        so2 = sc.nextFloat();
        if (so1>so2)
        System.out.println("so nho nhat la: "+so2);
        else System.out.println("so nho nhat la: "+so1);   
    
    }
}
