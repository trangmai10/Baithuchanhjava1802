package shape;
import java.util.Scanner;
import java.lang.Math;

public class Triangle extends Point{
    private float canhA;
    private float canhB;
    private float canhC;

    public void nhapTamGiac(){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        System.out.println("Nhap diem thu nhat:");
        p1.nhapdiem();
        System.out.println("Nhap diem thu hai:");
        p2.nhapdiem();
        System.out.println("Nhap diem thu ba:");
        p3.nhapdiem();

        //Tinh canh tam giac
        canhA = (float)Math.sqrt(Math.pow(p1.hoanhdo-p2.hoanhdo, 2)+Math.pow(p1.tungdo-p2.tungdo, 2));
        canhB = (float)Math.sqrt(Math.pow(p2.hoanhdo-p3.hoanhdo, 2)+Math.pow(p2.tungdo-p3.tungdo, 2));
        canhC = (float)Math.sqrt(Math.pow(p1.hoanhdo-p3.hoanhdo, 2)+Math.pow(p1.tungdo-p3.tungdo, 2));
    }

    public Boolean kiemTraTamGiac(){
        if(canhA + canhB > canhC || canhA + canhC > canhB || canhB + canhC > canhA){
            return true;
        }
        else 
            return false;
    }

    public String kiemTraLoaiTamGiac(){
        if(kiemTraTamGiac() == true){
        //ktra  tam giac vuong
            Boolean vuong = false;
            if(Math.pow(canhA,2)+Math.pow(canhB, 2) == Math.pow(canhC, 2))
                vuong = true;
                else if(Math.pow(canhB,2)+Math.pow(canhC, 2) == Math.pow(canhA, 2))
                    vuong = true;
                        else if(Math.pow(canhA,2)+Math.pow(canhC, 2) == Math.pow(canhB, 2))
                            vuong = true;

        if(canhA == canhB || canhA == canhC || canhB == canhC){
            if(vuong == true){
                return "Tam giac vuong can.";
            }   else {
                return "Tam giac can.";
            }
        } else {
            if(vuong == true)
                return "tam giac vuong";
        } 

        if(canhA == canhB && canhC == canhA)
            return "tam giac deu.";
        return "tam giac nhon.";
        } else {
            return "3 diem khong tao thanh tam giac.";
        }


        
        
    }
}
