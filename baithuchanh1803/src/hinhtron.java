
import java.util.Scanner;
public class hinhtron {
     final float pi=3.14f;
    float r;
    float cv;
    float dt; 
    void bankinh(){
        System.out.println("nhap vào bán kính đường tròn ");
        Scanner sr= new scanner(System.in);
        r=sr.nextFloat();
    }
    void chuvi(){
        cv=2*pi;
    }
    void dientich(){
        dt=pi*r*r;
    }
    void inchuvi(){
        System.out.println("in chu vi  đường tròn "+cv);
    }
    void indientich(){
        System.out.println("in dien tích đường tròn "+dt);
    }
     public static void main(String[] args) {
        hinhtron hinhtron=new myfirstclass().new hinhtron();
        hinhtron.bankinh();
        hinhtron.dientich();
        hinhtron.inchuvi();
        hinhtron.indientich();

    }
}

