package app54.shape;


    import java.net.PortUnreachableException;
    import java.util.Scanner;
    public class hinhtru extends hinhtron{
        public float chieuCao;
        //constructor
        public hinhtru(){
            ten="hinh tru";
        }
        public void nhapChieuCao(){
            nhapBanKinh();
            System.out.println("chieu cao: ");
            Scanner sc= new Scanner(System.in);
            chieuCao=sc.nextFloat();
    
        }
        public void tinhTheTich(){
            tinhDienTich();
            theTich=dienTich*chieuCao;
        }
    
         
}
