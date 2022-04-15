package app77;

import java.util.Scanner;
    
    public class hinhtron extends config {
        protected float banKinh;
        private Scanner scanner;
        
        public hinhtron() {
            super();
            scanner = new Scanner(System.in);
        }

        public void nhapBanKinh() {

            System.out.println("Bạn dùng đơn vị tính nào :");
            System.out.println("\t1 = Centimet");
            System.out.println("\t2 = inch");
            config.donVi = scanner.nextInt();
    
            System.out.println("Hãy nhập vào Bán kính Hình tròn ");
            banKinh = scanner.nextFloat();
        }
        public void inThongTin() {
            if(config.donVi==config.DON_VI_CM){
                System.out.println("Hình tròn có bán kính "+ banKinh +" cm ");
                System.out.println("Tương đương" +config.ChuyenCentimetSangInch(banKinh) + " inch");
            }else{
                System.out.println("Hình tròn có bán kính " + banKinh + " inch");
                System.out.println("Tương đương" + config.ChuyenInchSangCentimet(banKinh) + " cm");
            }
        }
        
