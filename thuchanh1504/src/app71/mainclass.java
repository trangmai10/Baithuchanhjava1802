package app71;
import app71.hinhtron;
import app71.toado;
public class mainclass {
    
        public static void main (String[]args){
            hinhtron ht = new hinhtron();
            ht.setBanKinh(10);
            float chuVi=ht.tinhChuVi();
            float dienTich= ht.tinhDienTich();
            System.out.println("chu vi hinh trong: "+chuVi+"\ndien tich hinh tron: "+ dienTich);
        }
    } 

