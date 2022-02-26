public class app11 {
    public static void main(String[] args) {
        int n = 200000, socach = 0, si, sj, i, j, k;
        for (i = n / 10000; i >= 0; i--)
        {
            si = n - i * 10000;
            for (j = si / 20000; j >= 0; j--)
            {
                sj = si - j * 20000;
                for (k = sj / 50000; k >= 0; k--)
                {
                    if (i * 10000 + j * 20000 + k * 50000 == 200000)
                    {
                        System.out.println(" to 10000, " + j + " to 20000, " + k + " to 50000." +"\n");
                        socach++;
                    }
                }
            }
        }
        System.out.println("Co tat ca " + socach + " Cach chon!\n");
		
		

	}
}
