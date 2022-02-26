import java.util.Scanner;

public class app2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        float canh1,canh2,canh3;
        System.out.println("nhap vao 3 canh cua tam giac: ");
    do{ canh1=scanner.nextFloat();
        canh2=scanner.nextFloat();
        canh3=scanner.nextFloat();
    }while(canh3<0||canh2<0||canh1<0);
    
    //kiem tra xem co phai tam giac k
    if(canh1<canh2+canh3 && canh2<canh1+canh3 && canh3<canh1+canh2)
    {
         //tam giac deu
         if(canh1==canh2&&canh2==canh3)
        System.out.println("tam giac deu");
        //tam giac vuong
         else if(canh1*canh1==canh2*canh2+canh3*canh3||canh2*canh2==canh1*canh1+canh3*canh3||canh3*canh3==canh2*canh2+canh1*canh1)
         System.out.println("tam giac vuong");
         //tam giac can
         else if(canh1==canh2||canh2==canh3||canh1==canh3)
         System.out.println("tam giac can");
         //tam giac vuong can
         else if((canh1*canh1==canh2*canh2+canh3*canh3||canh2*canh2==canh1*canh1+canh3*canh3||canh3*canh3==canh2*canh2+canh1*canh1)&&(canh1==canh2||canh2==canh3||canh1==canh3))
         System.out.println("tam giac vuong can");
    
    }else System.out.println("Day k phai la tam giac");
    }
    }

