package app54.shape;

public class hinhtron extends hinhhoc {
    public float banKinh;

    //constructor
    public hinhtron(){
        ten="hinh tron";
    }
    public void nhapBanKinh(){
        System.out.println("ban kinh:");
        Scanner sc=new Scanner(System.in);
        banKinh =sc.nextFloat();
    }
    public void tinhChuVi(){
        chuVi=2*pi*banKinh;
    }
    public void tinhDienTich(){
        dienTich = banKinh * banKinh * pi;
    }

    
}
