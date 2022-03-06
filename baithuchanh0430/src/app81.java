import java.util.Scanner;

public class app81 {
    public static void main(String args[], int max){
        // khai báo nhập dòng côt
        int n;
        int m;
        Scanner sr =new Scanner (System.in);
        n= sr.nextInt();
        Scanner sr = new Scanner (System.in) {
            m =sr.nextInt();
            System.out.println("nhập số cột =");
            System.out.println("nhập số  dòng :"); 
            //khai báo và cấp pháp mảng 
            int numer[][]=new int [n][m];
            System.out.println("nhập các phần tử ma trận ");
            for (int i=0 ; i< n ; i++){
                for(int j=0; j<m; j++){
                    
                    System.out.print("A[" + i + "]["+ j + "]= ");​
                    A[n][m]=sr.nextInt();
                }
                //GTLN  
               
                int max[n][m];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < m; j++) {
                        if (max < A[i][j]) {
                            max = A[i][j];
                        }
                    }
                }
                System.out.println("Phần tử lớn nhất trong ma trận = " + max);
            }
        }
    }
}
        
            

  

