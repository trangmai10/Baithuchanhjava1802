public class app9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong : ");
        int n;
        do{
            n= sc.nextInt();
        }while(n<0);
        for(int i=n;i>=0;i--)
        {System.out.println(i+"\t");}
}
}
