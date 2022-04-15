package app54.shape;
    import java.util.Scanner;
public class hinhvuong extends hinhchunhat{
    //constructor
    public hinhvuong(){
        ten ="hinh vuong";

    }
    public void nhapCanh(){
        System.out.println("canh: ");
        Scanner sc=new Scanner(System.in);
        dai = rong =sc.nextFloat();
    }
}

