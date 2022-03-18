import java.util.Scanner;
public class hinhtron {
    final float PI = 3.14f;
    float r, cv, dt;
   

    void nhapbankinh() {
        System.out.print("Nhap ban kinh: ");
        Scanner sc = new Scanner(System.in);
        r = sc.nextFloat();
    }
    void tinhchuvi() {
        cv = 2 * PI * r;
    }
    void tinhdientich() {
        dt = PI * r * r;
    }
   
    
    void inchuvi() {
        System.out.println("Chu vi hinh tron = " + cv);
    }
    void indientich() {
        System.out.println("Dien tich hinh tron = " + dt);
    }
    void chieudai(){
        System.out.println("chieu dài hinh tron = " );
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
    }
    void chieurong(){
        System.out.println("Dchieu rộng  hinh tron = " );
        Scanner sc = new Scanner(System.in);
        r = sc.nextInt();
    }
    public static void main(String[] args) {
        hinhtron ht = new hinhtron();
       
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
       
    }
}