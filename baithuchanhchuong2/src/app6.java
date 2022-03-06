public class app6 {
    public static void main(String args[]){
        Scanner sr =new Scanner (System.in);
        int a,temp=1;
        long giaithua=1;
        do{
        System.out.println("Nhập vào số bất kỳ : ");
        a=sr.nextInt();
        }
        while ((a<=0)||(a>10));
        while (temp <= a) {
            giaithua*= temp;
            temp++;
        }
         
        System.out.println(a + "! = " + giaithua);
    }
}

