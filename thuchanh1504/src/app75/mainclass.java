package app75;

import app75.hinhChuNhat;
import app75.hinhTron;
import app75.hinhhoc;

public class mainclass {
    public static void main(String[] args) {

        hinhhoc hinhHoc = new hinhhoc();
        hinhTron hinhTron1 = new hinhTron();
        hinhTron hinhTron2 = new hinhTron();
        hinhChuNhat hinhChuNhat = new hinhChuNhat();

        System.out.println("Có tất cả " + hinhHoc.dem + " hình trong ứng dụng trên ");
    }
}