package app54.main;

public class mainclass {
import shape.hinhchunhat;
import shape.hinhtron;
import shape.hinhtru;
import shape.hinhvuong;

public class mainClass{
    public static void main(String[]args)
    {
        //thu nghiem voi lop hinh tron
        hinhtron ht=new hinhtron();
        ht.xuatTen();
        ht.nhapBanKinh();
        ht.tinhChuVi();
        ht.tinhDienTich();
        ht.inChuVi();
        ht.inDienTich();

        //hinh tru
        hinhtru htru = new hinhtru();
        htru.xuatTen();
        htru.nhapChieuCao();
        htru.tinhTheTich();
        htru.inTheTich();

        //hinh chu nhat
        hinhchunhat hcn=new hinhchunhat();
        hcn.xuatTen();
        hcn.nhapChieuDai();
        hcn.nhapChieuRong();
        hcn.tinhChuVi();
        hcn.tinhDienTich();
        hcn.inChuVi();
        hcn.inDienTich();

        //hinh vuong
        hinhvuong hv = new hinhvuong();
        hv.xuatTen();
        hv.nhapCanh();
        hv.tinhChuVi();
        hv.tinhDienTich();
        hv.inChuVi();
        hv.inDienTich();

       
    }
}
}
