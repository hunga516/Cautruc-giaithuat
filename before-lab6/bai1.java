import java.util.Scanner;

public class bai1 {
    public static void giaiPhuongTrinhBac1(int a, int b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh co VO SO NGHIEM");
            } else {
                System.out.println("Phuong trinh VO NGHIEM");
            }
        } else {
            double ptbac1 = -b / a;
            System.out.println("Phuong trinh co nghiem la:" + ptbac1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        giaiPhuongTrinhBac1(a, b);
    }
} 