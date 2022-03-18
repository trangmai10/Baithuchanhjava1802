
    import java.util.Scanner;

public class sinhvien<DateTime>{
    String MaSv;
    String Hoten;
    Boolean Gioitinh;
    String DiaChi;
    DateTime NgaySinh;
   
    void nhapMaSv(){
        System.out.print("Nhap ma sinh vien: ");
        Scanner sc = new Scanner(System.in);
        MaSv = sc.nextLine();
    }
    void nhapHoten(){
        System.out.print("Nhap ho ten sinh vien: ");
        Scanner sc = new Scanner(System.in);
        Hoten = sc.nextLine();
    }
    void nhapGioiTinh(){
        System.out.print("Nhap gioi tinh: ");
        Scanner sc = new Scanner(System.in);
        Gioitinh = sc.hasNext();
    }
    void nhapDiaChi(){
        System.out.println("Nhap dia chi: ");
        Scanner sc = new Scanner(System.in);
        DiaChi = sc.nextLine();
    }
    void nhapNgaySinh(){
        System.out.println("Nhap ngay sinh: ");
        Scanner sc = new Scanner(System.in);
        NgaySinh = (DateTime) sc.nextLine();
    }
    void inMaSv(){
        System.out.println("Ma sinh vien: " + MaSv);
    }
    void inHoten(){
        System.out.println("Ho ten sinh vien: " + Hoten);
    }
    void inGioitinh(){
        System.out.println("Gioi tinh: " + Gioitinh);
    }
    void inDiaChi(){
        System.out.println("Dia chi: " + DiaChi);
    }
    void inNgaySinh(){
        System.out.println("Ngay sinh: " + NgaySinh);
    }
    public static void main(String[] args){
        sinhvien sv = new sinhvien();
        sv.nhapMaSv();
        sv.nhapHoten();
        sv.nhapGioiTinh();
        sv.nhapDiaChi();
        sv.nhapNgaySinh();
        sv.inMaSv();
        sv.inHoten();
        sv.inGioitinh();
        sv.inDiaChi();
        sv.inNgaySinh();
    }
}

