package shape;

public class Quadrilateral {
    private float canhA;
    private float canhB;
    private float canhC;
    private float canhD;
    private float temp1_3;
    private float temp2_4;
    private int vuong;

    public void nhapTuGiac(){
        Point p1 = new Point();
        Point p2 = new Point();
        Point p3 = new Point();
        Point p4 = new Point();

        System.out.println("Nhap diem A: ");
        p1.nhapdiem();
        System.out.println("Nhap diem B: ");
        p2.nhapdiem();
        System.out.println("Nhap diem  C: ");
        p3.nhapdiem();
        System.out.println("Nhap diem D: ");
        p4.nhapdiem();

        //Tinh canh tu giac
        canhA = (float)Math.sqrt(Math.pow(p1.hoanhdo-p2.hoanhdo, 2)+Math.pow(p1.tungdo-p2.tungdo, 2));
        canhB = (float)Math.sqrt(Math.pow(p2.hoanhdo-p3.hoanhdo, 2)+Math.pow(p2.tungdo-p3.tungdo, 2));
        canhC = (float)Math.sqrt(Math.pow(p3.hoanhdo-p4.hoanhdo, 2)+Math.pow(p3.tungdo-p4.tungdo, 2));
        canhD = (float)Math.sqrt(Math.pow(p4.hoanhdo-p1.hoanhdo, 2)+Math.pow(p4.tungdo-p1.tungdo, 2));
        temp1_3 = (float)Math.sqrt(Math.pow(p1.hoanhdo-p3.hoanhdo, 2)+Math.pow(p1.tungdo-p3.tungdo, 2));
        temp2_4 = (float)Math.sqrt(Math.pow(p2.hoanhdo-p4.hoanhdo, 2)+Math.pow(p2.tungdo-p4.tungdo, 2));
    }
    //ktra xem  có tứ giác  không
    public Boolean kiemTraTuGiac(){
        if(canhA + canhB == temp1_3 || canhB + canhC == temp2_4 || canhC + canhD == temp1_3 || canhA + canhD == temp2_4)
            return false;
        else return true;
    }

    public String kiemTraLoaiTuGiac(){
        vuong = 0;
        if(kiemTraTuGiac() == true){
            //xem có góc vuông 
        if(Math.pow(canhA,2)+Math.pow(canhB, 2) == Math.pow(temp1_3, 2))
        vuong++;
        if(Math.pow(canhB,2)+Math.pow(canhC, 2) == Math.pow(temp2_4, 2))
        vuong++;
        if(Math.pow(canhC,2)+Math.pow(canhD, 2) == Math.pow(temp1_3, 2))
        vuong++;
        if(Math.pow(canhA,2)+Math.pow(canhD, 2) == Math.pow(temp2_4, 2))
        vuong++;

    
        if(canhA == canhB && canhC == canhD && canhB == canhC){
            if(vuong >= 1)
                return "Hinh vuong.";
            else
                return "Hinh thoi.";
        } else if(canhA == canhC || canhB == canhD){
            if(vuong >= 1)
                return "Hinh chu nhat.";
            else
                return "Hinh binh hanh.";
        }
        return "Tu giac thuong";
            } else
                return "Khong phai la tu giac";
    }
}

