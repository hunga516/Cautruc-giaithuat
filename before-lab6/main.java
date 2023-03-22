import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        NhanVien nv = new NhanVien();
        nv.setSalary(sc.nextInt());
        System.out.println(nv.xuatThongTin());

        NhanVien pt = new NhanVienPartTime(); 
        System.out.println(pt.loaiNhanVien());

        NhanVien ft = new NhanVienFullTime(); 
        System.out.println(ft.loaiNhanVien());

    }
}
