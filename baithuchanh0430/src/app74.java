import java.util.Scanner;
public class app74 {
    public static void main(String args[]){
        int[] array = {5, 2, 3, 7, 5, 10};
        int sum = 0;
        
        for( int num : array) {
            sum = sum+num;
        }
        System.out.println("Kết quả là:"+sum);
    }
}