
 import java.util.Scanner;

public class person {
    String PersonID;
    String PersonName;
    Boolean Gender;
    String Address;
    void nhapPersonID() {
        System.out.print("Nhap PersonID: ");
        Scanner sc = new Scanner(System.in);
        PersonID = sc.nextLine();
    }
    void nhapPersonName() {
        System.out.print("Nhap PersonName: ");
        Scanner sc = new Scanner(System.in);
        PersonName = sc.nextLine();
    }
    void nhapGender() {
        System.out.print("Nhap Gender: ");
        Scanner sc = new Scanner(System.in);
        Gender = sc.hasNext();
    }
    void nhapAddress() {
        System.out.print("Nhap Address: ");
        Scanner sc = new Scanner(System.in);
        Address = sc.nextLine();
    }
    void inPersonID(){
        System.out.println("PersonID : " + PersonID);
    }
    void inPersonName(){
        System.out.println("PersonName : " + PersonName);
    }
    void inGender(){
        System.out.println("Gender : " + Gender);
    }
    void inAddress(){
        System.out.println("Address: " + Address);
    }
    public static void main(String[] args){
        person ps = new person();
        ps.nhapPersonID();
        ps.nhapPersonName();
        ps.nhapGender();
        ps.nhapAddress();
        ps.inPersonID();
        ps.inPersonName();
        ps.inGender();
        ps.inAddress();
    }
}

