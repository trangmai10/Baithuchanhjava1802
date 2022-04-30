package shape;

import java.util.Scanner;

public class Point {
public  String tendiem;
public   int  hoanhdo;
public  int tungdo;
    public Point (String tendiem, int hoanhdo,int tungdo){
        this.tendiem=tendiem;
        this.hoanhdo= hoanhdo;
        this.tungdo=tungdo;
    } 
    public Point() {
    }
    public float gethoanhdo(){
        return hoanhdo;
    }
    public float gettungdo(){
        return tungdo;
    }
    public void sethoanhdo(){
        this.hoanhdo=hoanhdo;
    }
    public void settungdo(){
        this.tungdo=tungdo;
        }
        
    public void nhapdiem(){
        Scanner sc= new Scanner(System.in);
        System.out.println("nhap  ten diem : " );
        tendiem=sc.nextLine();
        System.out.println("nhap hoang do :");
        hoanhdo=sc.nextInt();
        System.out.println("nhap tung do:");
        tungdo=sc.nextInt();
    }
    public void indiem( ){
        System.out.println(tendiem+ "("+hoanhdo+";"+tungdo+")");
    }
    
}