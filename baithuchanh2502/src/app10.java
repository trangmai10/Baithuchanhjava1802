public class app10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong : ");
        int n;
        do{
            n= sc.nextInt();
        }while(n<0);
        int dem=0;
         while(n>=10)
         {
             n/=10;
             dem++;
            }
        System.out.println("So vua nhap co "+(dem+1)+" chu so");
        
        
    }
}
