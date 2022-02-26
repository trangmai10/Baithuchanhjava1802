public class app3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao 1 so nguyen duong lon hon 1 : ");
        int n;
        do{
            n= scanner.nextInt();
        }while(n<2);
        if (KTraSNT(n)) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " k la so nguyen to");
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
