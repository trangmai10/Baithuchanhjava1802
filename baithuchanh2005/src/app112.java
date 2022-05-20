import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.Set;

public class app112 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tensv, thongTin = null;
        double diemsv;
        List<String> danhsachsv = new LinkedList<String>();
        do {
            System.out.println("Nhap vao ten sinh vien: ");
            tensv = sc.nextLine();
            if (!tensv.isEmpty()) {
                System.out.println("Nhap vao diem sinh vien: ");
                diemsv = sc.nextDouble();
                thongTin = tensv + "\t" + diemsv;
                danhsachsv.add(thongTin);
            }
        } while (!tensv.isEmpty());
        System.out.println("So sinh vien co trong danh sach = " + danhsachsv.size());
        System.out.println("Thong tin cac sinh vien vua nhap la: ");
        System.out.println("Ten sinh vien" + "\t" + "diem: ");
        Iterator<String> iterator = danhsachsv.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // luu tru ds
        List<String> danhsachsvthilai = new LinkedList<String>();
        for (int i = 0; i < danhsachsv.size(); i++) {
            String sv = danhsachsv.get(i);
        }
        for (int i = 0; i < danhsachsv.size(); i++) {

        }
    }
}
