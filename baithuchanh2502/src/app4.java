public class app4 {
    public static void main(String[] args) 
{
     Scanner sc = new Scanner(System.in);
    System.out.print("nhap vao 1 so nguyen duong : ");
    int n;
    do{
        n= sc.nextInt();
    }while(n<0);
    for(int i=2;i<n;i++)
    {if(KTraSNT(i))
        System.out.println(i);   
    }

}


public static boolean KTraSNT(int n) {
if (n <= 1) {
    return false;
}
for (int i = 2; i <= Math.sqrt(n); i++)
{
    if (n % i == 0) 
    {
        return false;
    }
}
return true;

}        
}
