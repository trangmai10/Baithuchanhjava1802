import java.util.Scanner;
class DienTichChuViHT {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
                
        double dai = 0, rong = 0, r = 0, pi = 3.14,cvht = 0, dtht = 0, cvhcn = 0, dthcn = 0;
        while (true) {
                    

            System.out.println("Mời nhập vào bán kính hình tròn:");
            r = scanner.nextDouble();
                      
                
            cvht = 2*pi*r;
            System.out.println("Chu vi hình tròn là:"+ cvht);
                    
                
            dtht = pi*r*r;
            System.out.println("Diện tích hình tròn là:"+ dtht);
                   
                
            System.out.println("Mời nhập vào chiều dài hình chữ nhật:");
            dai = scanner.nextDouble();
            System.out.println("Mời nhập vào chiều rộng hình chữ nhật:");
            rong = scanner.nextDouble();
                     
                    
            cvhcn = 2*(dai + rong);
            System.out.println("Chu vi hình chữ nhật là:"+ cvhcn);
                     
                   
            dthcn = dai * rong;
            System.out.println("Diện tích hìnhchữ nhật là:"+ dthcn);
                     
                    
             System.out.println("exited!");
                       
                      
                   
            System.out.println(" Nhập thông tin hình tròn.");
            System.out.println(" Tính chu vi hình tròn.");
            System.out.println(" Tính diện tích hình tròn.");
            System.out.println(" Nhập thông tin hình chữ nhật.");
            System.out.println(" Tính chu vi hình chữ nhật.");
            System.out.println("Tính diện tích hình chữ nhật.");
                
            System.out.println("---------------------------");
           
        }
    }
}