import java.util.Scanner;

public class app40 {
    public static void main(String[] args) 
    { Scanner sc = new Scanner(System.in);
      int thu;
      System.out.println("nhap vao so thu: ");
      thu=sc.nextInt();
      switch(thu)
    {  case 2: System.out.println("thu 2");
                break;
       case 3: System.out.println("thu 3");
                break;
        case 4: System.out.println("thu 4");
                break;
        case 5: System.out.println("thu 5");
                break;
        case 6: System.out.println("thu 6");
                break;
        case 7: System.out.println("thu 7");
                break;
        case 8: System.out.println("chu nhat");
                break;
        default : 
        System.out.println("nhap vao so thu khong dung");
                break;
    }        
}
}
