import java.util.Scanner;

public class bai4 {

    public static void ChucNangMenu() {
        System.out.println("1.Tinh phuong trinh BAC 1");
        System.out.println("2.Tinh phuong trinh BAC 2");
        System.out.println("3.Tinh tien dien thang nay di ban eii");
        System.out.println("4.Thoat");
        Scanner sc = new Scanner(System.in);
        int chon = sc.nextInt();
        switch (chon) {
            case 1:
                System.out.println("a =");
                int a = sc.nextInt();
                System.out.println("b=");
                int b = sc.nextInt();
                bai1.giaiPhuongTrinhBac1(a, b);
                break;
            case 2:
                System.out.println("a=");
                a = sc.nextInt();
                System.out.println("b=");
                b = sc.nextInt();
                System.out.println("c=");
                int c = sc.nextInt();
                bai2.giaiPhuongTrinhBac2(a, b, c);
                break;
            case 3:
                System.out.println("a=");
                a = sc.nextInt();
                bai3.tinhTienDien(a);
                break;
                default:
                System.exit(0);

        }
    }

    public static void main(String[] args) {
        ChucNangMenu();
    }
}
