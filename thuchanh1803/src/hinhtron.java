import java.util.Scanner;
public class hinhtron {
    final float PI = 3.14f;
    float r, cv, dt;
    int chieudai, chieurong;

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
    void tinhdientichhcn(){
        dt = chieudai*chieurong;
    }
    void tinhchuvihcn(){
        cv =(chieudai + chieurong)/2;
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
        hinhchunhat hinhchunhat = new hinhchunhat();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.inchuvi();
        ht.indientich();
        System.out.println("\n\n");
        hinhchunhat.chieudai();
        hinhchunhat.chieurong();
        hinhchunhat.tinhchuvihcn();
        hinhchunhat.tinhdientichhcn();
    }
}