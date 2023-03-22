import java.util.Scanner;

public class bai2 {
    public static void giaiPhuongTrinhBac2(float a, float b, float c) {
        float ptbac1 = (float) -c / b;
        if (a == 0) {
            System.out.println("Phuong trinh bac nhat la:" + ptbac1);
        } else {
            float delta = (float) b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phuong trinh VO NGHIEM");
            } else if (delta == 0) {
                System.out.println("Phuong trinh co nghiem kep:" + (float) -b / (2 * a));
            } else {
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("X1:" + (float) ((-b + Math.sqrt(delta)) / (2 * a)));
                ;
                System.out.print("X2:" + (float) ((-b + Math.sqrt(delta)) / (2 * a)));

            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float a = scanner.nextInt();
        float b = scanner.nextInt();
        float c = scanner.nextInt();
        giaiPhuongTrinhBac2(a, b, c);
    }
}