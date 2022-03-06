import java.util.Scanner;

public class app1 {
    public static void main(String args[]){
        int a, b; 
        System.out.println("nhập vào a :");
        Scanner sr =new Scanner (System.in);
        a = sr.nextInt();
        System.out.println("nhập vào số b :");
        
        b= sr.nextInt();
        //tinh tổng , hiệu , tích thương 
        int tong= a+b;
        System.out.println(a+"+" +b+ "="+tong );
        int hieu=a-b;
        System.out.println(a+"-" +b+ "="+hieu );
        int tich=a*b;
        System.out.println(a+"*" +b+ "="+tich );
        int phandu= a%b;
        System.out.println(a+"%" +b+ "="+phandu );

        int thuong = a/b;
        System.out.println(a+"/" +b+ "="+thuong );
        //so sánh 2 số bằng nhau 
        System.out.println("Kết quả so sánh bằng 2 số " + a + " và " + b + " là " + (a == b));
        //so sánh 2 số k bảng nhau
        System.out.println("Kết quả so sánh bằng 2 số " + a + " và " + b + " là " + (a != b));
        // so sánh lớn hơn 
        System.out.println("Kết quả so sánh bằng 2 số " +a + " và " + b + " là " + (a> b));
    }
}
