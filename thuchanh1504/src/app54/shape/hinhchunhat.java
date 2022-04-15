package app54.shape;

public class hinhchunhat {
    public float dai;
    public float rong;
    //constructor
    public hinhchunhat(){
        ten ="hinh chu nhat";
    }
    public void nhapChieuDai(){
        System.out.println("chieu dai:");
        Scanner sc=new Scanner(System.in);
        dai=sc.nextFloat();

    }
    public void nhapChieuRong(){
        System.out.println("chieu rong:");
        Scanner sc=new Scanner(System.in);
        rong=sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi=(dai+rong)*2;
    }
     public void tinhDienTich(){
         dienTich=dai*rong;
     }
}
