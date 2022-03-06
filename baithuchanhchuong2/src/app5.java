public class app5 {
    public static void main(String args[]){
        int a ,sumer=0;
        Scanner sr =new Scanner (System.in);
        while (a<100){
        System.out.println("Nhập vào số bất kỳ : ");
        a= sr.nextInt();
        sumer +=a;
        }
        System.out.println("tổng số nguyên  =" + sumer);
    }
}
