import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double kq = Math.sqrt(n);
        if (kq * kq == n) {
            System.out.println(n + "  La so chinh phuong nhe!!!");
        } else {
            System.out.println(n + "  Khong phai la so chinh phuong nhe!!!");
        }
    }
}
