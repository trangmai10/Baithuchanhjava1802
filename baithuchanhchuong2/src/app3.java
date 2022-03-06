import java.util.Scanner;

public class app3 {
    public static void main(String args[]){
        String name, agegroup ;
        int age, year;
        System.out.println("nhập vào tên  :");
        Scanner sr =new Scanner (System.in);
         name= sr.nextLine();
         System.out.println("nhập vào năm   :");
        year = sr.nextInt();
         age=2020-year;
        if(age <16){
           agegroup= ("bạn tuổi vị thành niên  ");
        }else if (age >= 16 || age < 18){
            agegroup=("bạn ở tuổi trưởng thành ");
        }
        else {
            agegroup=("bạn đã già ");
        }
        System.out.println("Bạn " + name + " thuộc nhóm " +agegroup);
    }
}
