import java.util.Scanner;

public class app2 {
    public static void main(String args[]){
        int a;
        System.out.println("nhập vào a :");
        Scanner sr =new Scanner (System.in);
        a = sr.nextInt();
        if (a%2==0){
            System.out.println("là số chẵn ");
        }
        else {
            System.out.println("là số lẻ ");
        }
    }
}
