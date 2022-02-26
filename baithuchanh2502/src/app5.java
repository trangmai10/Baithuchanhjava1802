public class app5 {
     public static void main(String[] args)
            {
               Scanner sc = new Scanner(System.in);
               System.out.print("nhap vao 1 so nguyen duong : ");
               int n;
               do{
                   n= sc.nextInt();
               }while(n<0);
               int sum=0;
               for(int i=1;i<n;i++)
               {
                   if(n%i==0)
                   {
                       sum+=i;
                   }
               }
               if(n==sum)
               {
                   System.out.println(n+" la so hoan thien ");
               }
               else
               {
                   System.out.println(n+" khong la so hoan thien");
               }
            }
}
